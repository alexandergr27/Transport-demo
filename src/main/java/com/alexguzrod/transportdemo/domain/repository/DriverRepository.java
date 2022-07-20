package com.alexguzrod.transportdemo.domain.repository;

import com.alexguzrod.transportdemo.domain.model.Driver;

import java.util.List;

public interface DriverRepository {

    Driver getDriver(Long driverId);

    List<Driver> getAllDrivers();

    Driver saveDriver(Driver driver);

    Driver updateDriver(Driver driver);

    String deleteDriver(Long driverId);
}
