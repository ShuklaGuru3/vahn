package org.example.vahn.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.vahn.dto.VahnGenericResponse;
import org.example.vahn.dto.request.EmployeeRequest;
import org.example.vahn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Object> addEmployee(@RequestBody EmployeeRequest request) {
        log.info("Request received for adding employee " + request);
        employeeService.addEmployee(request);
        return null;
    }

    @GetMapping("/fetch")
    public VahnGenericResponse<EmployeeRequest> fetchEmployee(@RequestParam(value = "id") String employeeId) {
        EmployeeRequest employee = employeeService.fetchEmployee(employeeId);
        return VahnGenericResponse.ok(employee);
    }


    // feedback - limitations ~ should handle errors in better way
}
