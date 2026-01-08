package org.example.vahn.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class EmployeeRequest {
    private int employeeId;
    private String name;
    private String city;
    private String department;
    private String managerId;
    private String dateOfJoining;
    private String salary;

    /*
    - employeeId
- name
- city
- department
- managerId
- dateOfJoining
- salary
     */
}
