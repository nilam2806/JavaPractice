package com.employeeMgmt.main.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;


import com.employeeMgmt.main.entity.Employee;
import com.employeeMgmt.main.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class EmployeeControllerTest {

    @InjectMocks
    private EmployeeController employeeController;

    @Mock
    private EmployeeService employeeService;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    void testGetAllEmployees() throws Exception {
        // Arrange
        Employee employee1 = new Employee("John", "john@example.com", "HR");
        employee1.setEmp_id(1L);
        Employee employee2 = new Employee("Jane", "jane@example.com", "Finance");
        employee2.setEmp_id(2L);
        List<Employee> employees = Arrays.asList(employee1, employee2);
        when(employeeService.getAllEmployees()).thenReturn(employees);

        // Act & Assert
        mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(jsonPath("$[0].emp_name").value("John"))
                .andExpect(jsonPath("$[1].emp_name").value("Jane"));
    }

    @Test
    void testGetAllEmployees_NoContent() throws Exception {
        // Arrange
        when(employeeService.getAllEmployees()).thenReturn(Arrays.asList());

        // Act & Assert
        mockMvc.perform(get("/employees"))
                .andExpect(status().isNoContent());
    }

    @Test
    void testGetEmployeeById() throws Exception {
        // Arrange
        Employee employee = new Employee("John", "john@example.com", "HR");
        employee.setEmp_id(1L);
        when(employeeService.getEmployeeById(1L)).thenReturn(Optional.of(employee));

        // Act & Assert
        mockMvc.perform(get("/employees/{emp_id}", 1L)).andExpect(status().isOk())
                .andExpect(jsonPath("$.emp_name").value("John"));
    }

    @Test
    void testGetEmployeeById_NotFound() throws Exception {
        // Arrange
        when(employeeService.getEmployeeById(1L)).thenReturn(Optional.empty());

        // Act & Assert
        mockMvc.perform(get("/employees/{emp_id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    void testCreateEmployee() throws Exception {
        // Arrange
        Employee newEmployee = new Employee("Jane", "jane@example.com", "Finance");
        newEmployee.setEmp_id(2L);
        when(employeeService.createEmployee(any(Employee.class))).thenReturn(newEmployee);

        // Act & Assert
        mockMvc.perform(post("/employees/create_employee").contentType(MediaType.APPLICATION_JSON)
                        .content("{\"emp_name\": \"Jane\", \"email\": \"jane@example.com\", \"department\": \"Finance\"}"))
                .andExpect(status().isCreated()).andExpect(content().string("Employee created successfully: Jane"));
    }

    @Test
    void testCreateEmployee_BadRequest() throws Exception {
        // Arrange
        Employee newEmployee = new Employee("Jane", "jane@example.com", "Finance");
        when(employeeService.createEmployee(any(Employee.class)))
                .thenThrow(new RuntimeException("Email already exists. Cannot create employee with duplicate email."));

        // Act & Assert
        mockMvc.perform(post("/employees/create_employee").contentType(MediaType.APPLICATION_JSON)
                        .content("{\"emp_name\": \"Jane\", \"email\": \"jane@example.com\", \"department\": \"Finance\"}"))
                .andExpect(status().isBadRequest()).andExpect(content().string(
                        "Error creating employee: Email already exists. Cannot create employee with duplicate email."));
    }

    @Test
    void testUpdateEmployee() throws Exception {
        // Arrange
        Employee updatedEmployee = new Employee("John Doe", "john.doe@example.com", "HR");
        updatedEmployee.setEmp_id(1L);
        when(employeeService.updateEmployee(eq(1L), any(Employee.class))).thenReturn(updatedEmployee);

        // Act & Assert
        mockMvc.perform(put("/employees/update/{emp_id}", 1L).contentType(MediaType.APPLICATION_JSON)
                        .content("{\"emp_name\": \"John Doe\", \"email\": \"john.doe@example.com\", \"department\": \"HR\"}"))
                .andExpect(status().isOk()).andExpect(content().string("Employee updated successfully: John Doe"));
    }

    @Test
    void testUpdateEmployee_NotFound() throws Exception {
        // Arrange
        when(employeeService.updateEmployee(eq(1L), any(Employee.class)))
                .thenThrow(new IllegalArgumentException("Employee with ID 1 not found."));

        // Act & Assert
        mockMvc.perform(put("/employees/update/{emp_id}", 1L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"emp_name\": \"John Doe\", \"email\": \"john.doe@example.com\", \"department\": \"HR\"}"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("Error updating employee: Employee with ID 1 not found."));
    }

    @Test
    void testDeleteEmployee() throws Exception {
        // Arrange
        doNothing().when(employeeService).deleteEmployee(1L);

        // Act & Assert
        mockMvc.perform(delete("/employees/delete/{emp_id}", 1L)).andExpect(status().isOk())
                .andExpect(content().string("Employee with ID 1 has been deleted successfully"));
    }

    @Test
    void testDeleteEmployee_NotFound() throws Exception {
        // Arrange
        doThrow(new RuntimeException("Employee with ID 1 does not exist.")).when(employeeService).deleteEmployee(1L);

        // Act & Assert
        mockMvc.perform(delete("/employees/delete/{emp_id}", 1L)).andExpect(status().isNotFound())
                .andExpect(content().string("Error deleting employee: Employee with ID 1 does not exist."));
    }
}
