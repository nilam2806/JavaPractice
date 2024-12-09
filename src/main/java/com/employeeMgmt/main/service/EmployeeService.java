package com.employeeMgmt.main.service;

import com.employeeMgmt.main.entity.Employee;
import com.employeeMgmt.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(Long emp_id) {

        if (employeeRepository.existsById(emp_id)) {
            return employeeRepository.findById(emp_id);
        } else {
            return Optional.empty();
        }
    }

    // Create new employee
    public Employee createEmployee(Employee employee) {

        boolean emailExists = employeeRepository.findAll().stream()
                .anyMatch(emp -> emp.getEmail().equalsIgnoreCase(employee.getEmail()));
        if (emailExists) {
            throw new RuntimeException("Email already exists. Cannot create employee with duplicate email.");
        }
        return employeeRepository.save(employee);
    }

    // Update employee
    public Employee updateEmployee(Long emp_id, Employee employeeDetails) {

        Employee employee = employeeRepository.findById(emp_id)
                .orElseThrow(() -> new IllegalArgumentException("Employee with ID " + emp_id + " not found."));

        if (employeeDetails.getEmp_name() != null && !employeeDetails.getEmp_name().isEmpty()) {
            employee.setEmp_name(employeeDetails.getEmp_name());
        }

        if (employeeDetails.getEmail() != null && !employeeDetails.getEmail().isEmpty()) {
            employee.setEmail(employeeDetails.getEmail());
        }

        if (employeeDetails.getDepartment() != null && !employeeDetails.getDepartment().isEmpty()) {
            employee.setDepartment(employeeDetails.getDepartment());
        }

        return employeeRepository.save(employee);
    }

    // Delete employee
    public void deleteEmployee(Long emp_id) {

        if (!employeeRepository.existsById(emp_id)) {
            throw new RuntimeException("Employee with ID " + emp_id + " does not exist.");
        }
        employeeRepository.deleteById(emp_id);
    }
}
