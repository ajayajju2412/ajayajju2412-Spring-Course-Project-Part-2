package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.entities.Users;
import com.upgrad.HireWheelsSB.entities.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleByUserID(Users user);

}
