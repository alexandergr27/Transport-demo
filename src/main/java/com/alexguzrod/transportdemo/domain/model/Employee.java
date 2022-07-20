package com.alexguzrod.transportdemo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long employeeId;
    private String employeeName;
    private String employeeLastName;
    private Date employeeDateOfBirth;
    private String employeePhoneNumber;
    private String employeePosition;
    private String employeeStatus;
    private Date employeeHireDate;
}
