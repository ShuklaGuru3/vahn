package org.example.vahn.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.vahn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


//    Employee findById(Integer employeeId);
}
