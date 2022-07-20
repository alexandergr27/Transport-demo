package com.alexguzrod.transportdemo.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "driver")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverEntity {

    @Id
    @Column(name = "driver_id", nullable = false)
    private Long driverId;
    @Column(name = "driver_route", length = 80)
    private String driverRoute;
    @Column(name = "driver_score")
    private Integer driverScore;
    @ManyToOne
    private EmployeeEntity employee;
}
