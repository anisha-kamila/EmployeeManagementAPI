package com.example.EmployeeManagementAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagementAPI.model.Employee;
import com.example.EmployeeManagementAPI.repository.EmployeeRepository;

@Service
public class EmployeeService {
	 @Autowired
	    private EmployeeRepository repo;

	    public Employee saveEmployee(Employee e) {
	        return repo.save(e);
	    }

	    public List<Employee> getAllEmployees() {
	        return repo.findAll();
	    }

	    public Employee getEmployeeById(Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    public Employee updateEmployee(Long id, Employee e) {
	        e.setId(id);
	        return repo.save(e);
	    }

	    public void deleteEmployee(Long id) {
	        repo.deleteById(id);
	    }
}
