package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class VahnApplication {
    public static void main(String[] args) {
        SpringApplication.run(VahnApplication.class, args);
    }
}
/*

Build a production grade backend service to manage employee data.
The service should expose CRUD APIs to create, update, retrieve, and delete employee records.
You may use an in-memory datastore (no external DB required).

Employee Entity (example fields)
- employeeId
- name
- city
- department
- managerId
- dateOfJoining
- salary


 */