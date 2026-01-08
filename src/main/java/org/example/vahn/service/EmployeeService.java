package org.example.vahn.service;


import lombok.extern.slf4j.Slf4j;
import org.example.vahn.dto.request.EmployeeRequest;
import org.example.vahn.model.Employee;
import org.example.vahn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeRequest fetchEmployee(String employeeId) {
        try {
            Optional<Employee> employee = employeeRepository.findById(Integer.parseInt(employeeId));
            if (employee.isEmpty()) return null;
            Employee emp = employee.get();
            return EmployeeRequest.builder()
                    .employeeId(Integer.parseInt(employeeId))
                    .name(emp.getName())
                    .city(emp.getCity())
                    .department(emp.getDepartment())
                    .salary(emp.getSalary())
                    .managerId(emp.getManagerId())
                    .dateOfJoining(emp.getDateOfJoining())
                    .build();
        } catch (Exception e) {
            log.error("Something went wrong while fetch employee with employee id " + employeeId);
            return null;
        }
    }


    public void addEmployee(EmployeeRequest request) {
        try {
            Employee employee = Employee.builder()
                    .id(request.getEmployeeId())
                    .name(request.getName())
                    .dateOfJoining(request.getDateOfJoining())
                    .city(request.getCity())
                    .department(request.getDepartment())
                    .salary(request.getSalary())
                    .managerId(request.getManagerId())
                    .build();

            employeeRepository.save(employee);
        } catch (Exception e) {
            log.error("Something went wrong while saving employee with request" + request);
        }
    }
}
