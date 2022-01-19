package com.example.scompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.scompany.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
@Query
    ("SELECT e FROM Employee e WHERE "
            + "CONCAT(e.id, e.ename, e.mobile, e.salary, e.address)"
            + "LIKE %?1%")

    public List<Employee> findAll(String keyword);
 
}