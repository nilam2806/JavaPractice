package com.employeeMgmt.main.controller;

import com.employeeMgmt.main.entity.Employee;
import com.employeeMgmt.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Get all employees
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        if (employees.isEmpty()) {
            return ResponseEntity.noContent().build(); // Return 204 No Content if no employees found
        }
        return ResponseEntity.ok(employees); // Return 200 OK with the list of employees
    }

    // Get employee by ID
    @GetMapping("/employees/get/{emp_id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long emp_id) {
        return employeeService.getEmployeeById(emp_id).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)); // Return 404 if employee is
        // not found
    }

    // Create new employee
    @PostMapping("/employees/create_employee")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        try {
            Employee createdEmployee = employeeService.createEmployee(employee);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Employee created successfully: " + createdEmployee.getEmp_name());
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error creating employee: " + e.getMessage()); // Handle

        }
    }

    // Update employee
    @PutMapping("/employees/update/{emp_id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Long emp_id, @RequestBody Employee employeeDetails) {
        try {
            Employee updatedEmployee = employeeService.updateEmployee(emp_id, employeeDetails);
            return ResponseEntity.ok("Employee updated successfully: " + updatedEmployee.getEmp_name());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error updating employee: " + e.getMessage());
        }
    }

    // Delete employee
    @DeleteMapping("/employees/delete/{emp_id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long emp_id) {
        try {
            employeeService.deleteEmployee(emp_id);
            return ResponseEntity.ok("Employee with ID " + emp_id + " has been deleted successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error deleting employee: " + e.getMessage());
        }
    }
}
