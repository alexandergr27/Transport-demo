package com.alexguzrod.transportdemo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    private String driverRoute;
    private Integer driverScore;
    private Employee employee;
}
