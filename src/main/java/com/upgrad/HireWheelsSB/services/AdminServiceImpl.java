package com.upgrad.HireWheelsSB.services;



import com.upgrad.HireWheelsSB.daos.VehicleDAO;
import com.upgrad.HireWheelsSB.entities.Vehicle;
import com.upgrad.HireWheelsSB.exceptions.VehicleAlreadyRegisteredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

    @Autowired @Qualifier("vehicleDAO")
    VehicleDAO vehicleDAO;

    /*============================TODO 5.2==================================*/

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) throws VehicleAlreadyRegisteredException {
         Vehicle savedVehicleNumber1 = vehicleDAO.findVehicleByVehicleNumber(vehicle.getVehicleNumber());
         if(savedVehicleNumber1 != null){
             throw new VehicleAlreadyRegisteredException("Vehicle with Vehicle Number "+vehicle.getVehicleNumber()+" already Registered");
         }
         Vehicle savedVehicle = vehicleDAO.save(vehicle);
         Vehicle savedVehicleNumber2 = vehicleDAO.findVehicleByVehicleNumber(savedVehicle.getVehicleNumber());
         savedVehicleNumber2.setAvailabilityStatus(1);
         Vehicle registeredVehicle = vehicleDAO.save(savedVehicleNumber2);
        return registeredVehicle;
    }

    /*============================TODO 6.1==================================*/

    /*@Override
    public Vehicle changeAvailability(Vehicle vehicle) {
        return null;
    }*/
}
