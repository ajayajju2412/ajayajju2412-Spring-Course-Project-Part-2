package com.upgrad.HireWheelsSB.daos;


import com.upgrad.HireWheelsSB.entities.Users;
import com.upgrad.HireWheelsSB.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleDAO")
public interface VehicleDAO extends JpaRepository<Vehicle,Integer> {
    Vehicle findVehicleByVehicleNumber(String vehicleNumber);
    Vehicle findVehicleByUser(Users user);
}
