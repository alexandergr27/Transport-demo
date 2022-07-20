package com.alexguzrod.transportdemo.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;
    @Column(name = "employee_name", length = 80)
    private String employeeName;
    @Column(name = "employee_last_name", length = 80)
    private String employeeLastName;
    @Temporal(TemporalType.DATE)
    private Date employeeDateOfBirth;
    @Column(name = "employee_phone", length = 15)
    private String employeePhoneNumber;
    @Column(name = "employee_position", length = 80)
    private String employeePosition;
    @Column(name = "employee_status", length = 1, nullable = false)
    private String employeeStatus;
    @Temporal(TemporalType.DATE)
    private Date employeeHireDate;
}
