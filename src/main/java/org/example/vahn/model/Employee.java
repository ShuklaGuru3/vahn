package org.example.vahn.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "employee")
public class Employee {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "department")
    private String department;

    @Column(name = "manager_id")
    private String managerId;

    @Column(name = "salary")
    private String salary;

    @Column(name = "date_of_joining")
    private String dateOfJoining;

    @Column(name = "date_created")
    @CurrentTimestamp
    private LocalDateTime dateCreated;
}

