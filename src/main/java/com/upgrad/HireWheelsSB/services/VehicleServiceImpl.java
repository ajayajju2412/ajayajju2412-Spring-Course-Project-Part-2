package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.daos.VehicleDAO;
import com.upgrad.HireWheelsSB.entities.Users;
import com.upgrad.HireWheelsSB.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService{

    @Autowired @Qualifier("vehicleDAO")
    VehicleDAO vehicleDAO;

    /*============================TODO 7.1===================================*/

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = vehicleDAO.findAll();
        return vehicles;
    }

    /*============================TODO 7.2===================================*/

    @Override
    public Vehicle getVehicleByUserID(Users user) {
        Vehicle savedVehicleUser = vehicleDAO.findVehicleByUser(user);
        return savedVehicleUser;
    }


}
