package com.example.EmployeeManagementAPI.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EmployeeManagementAPI.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
