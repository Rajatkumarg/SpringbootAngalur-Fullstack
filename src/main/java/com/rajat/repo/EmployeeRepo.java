package com.rajat.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajat.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
