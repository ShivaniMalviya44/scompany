package com.example.scompany.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scompany.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
}