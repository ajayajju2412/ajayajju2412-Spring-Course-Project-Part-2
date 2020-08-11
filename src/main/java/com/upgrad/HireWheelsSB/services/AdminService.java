package com.upgrad.HireWheelsSB.services;


import com.upgrad.HireWheelsSB.entities.Vehicle;
import com.upgrad.HireWheelsSB.exceptions.VehicleAlreadyRegisteredException;

public interface AdminService {
    Vehicle registerVehicle(Vehicle vehicle) throws VehicleAlreadyRegisteredException;
    //Vehicle changeAvailability(Vehicle vehicle);
}
