package com.employeeMgmt.main.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.employeeMgmt.main.entity.Employee;
import com.employeeMgmt.main.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllEmployees() {
        // Arrange
        Employee employee1 = new Employee("John", "john@example.com", "HR");
        Employee employee2 = new Employee("Jane", "jane@example.com", "Finance");
        when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee1, employee2));

        // Act
        List<Employee> result = employeeService.getAllEmployees();

        // Assert
        assertEquals(2, result.size());
        assertEquals("John", result.get(0).getEmp_name());
        assertEquals("Jane", result.get(1).getEmp_name());
    }

    @Test
    void testGetEmployeeById_Exists() {
        // Arrange
        Long empId = 1L;
        Employee employee = new Employee("John", "john@example.com", "HR");
        employee.setEmp_id(empId);

        when(employeeRepository.existsById(empId)).thenReturn(true);
        when(employeeRepository.findById(empId)).thenReturn(Optional.of(employee));

        // Act
        Optional<Employee> result = employeeService.getEmployeeById(empId);

        // Assert
        assertTrue(result.isPresent());
        assertEquals(employee, result.get());
    }

    @Test
    void testGetEmployeeById_NotExists() {
        // Arrange
        Long empId = 1L;

        when(employeeRepository.existsById(empId)).thenReturn(false);

        // Act
        Optional<Employee> result = employeeService.getEmployeeById(empId);

        // Assert
        assertFalse(result.isPresent()); // This will cover the return Optional.empty()
    }

    @Test
    void testCreateEmployee() {
        Employee employee = new Employee("John", "john@example.com", "HR");

        when(employeeRepository.findAll()).thenReturn(Arrays.asList());
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        Employee createdEmployee = employeeService.createEmployee(employee);
        assertNotNull(createdEmployee);
        assertEquals("John", createdEmployee.getEmp_name());
    }

    @Test
    void testCreateEmployee_DuplicateEmail() {
        // Arrange
        Employee existingEmployee = new Employee("John", "john@example.com", "HR");
        Employee newEmployee = new Employee("Jane", "john@example.com", "Finance"); // Same email as existing

        when(employeeRepository.findAll()).thenReturn(List.of(existingEmployee));

        // Act & Assert
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            employeeService.createEmployee(newEmployee);
        });
        assertEquals("Email already exists. Cannot create employee with duplicate email.", exception.getMessage());
    }

    @Test
    void testUpdateEmployee() {
        Employee existingEmployee = new Employee("John", "john@example.com", "HR");
        Employee updatedEmployeeDetails = new Employee("Johnny", "johnny@example.com", "HR");

        when(employeeRepository.findById(1L)).thenReturn(Optional.of(existingEmployee));
        when(employeeRepository.save(any(Employee.class))).thenReturn(updatedEmployeeDetails);

        Employee updatedEmployee = employeeService.updateEmployee(1L, updatedEmployeeDetails);
        assertEquals("Johnny", updatedEmployee.getEmp_name());
    }

    @Test
    void testUpdateEmployee_NotFound() {
        // Arrange
        Employee employeeDetails = new Employee("John Doe", "john.doe@example.com", "HR");
        when(employeeRepository.findById(1L)).thenReturn(Optional.empty());

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            employeeService.updateEmployee(1L, employeeDetails);
        });
        assertEquals("Employee with ID 1 not found.", exception.getMessage());
    }

    @Test
    void testDeleteEmployee() {
        when(employeeRepository.existsById(1L)).thenReturn(true);
        doNothing().when(employeeRepository).deleteById(1L);

        employeeService.deleteEmployee(1L);
        verify(employeeRepository, times(1)).deleteById(1L);
    }

    @Test
    void testDeleteEmployee_NotFound() {
        // Arrange
        when(employeeRepository.existsById(1L)).thenReturn(false);

        // Act & Assert
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            employeeService.deleteEmployee(1L);
        });
        assertEquals("Employee with ID 1 does not exist.", exception.getMessage());
    }
}
