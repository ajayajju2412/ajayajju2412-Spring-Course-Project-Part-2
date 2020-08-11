package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.entities.*;

import java.awt.print.Book;

public interface initService {


    Users populateUserDetails(Users user);
    Role populateUserRoleDetails(Role role);
    VehicleCategory populateVehicleCategoryDetails(VehicleCategory vehicleCategory);
    VehicleSubCategory populateVehicleSubCategoryDetails(VehicleSubCategory vehicleSubCategory);
    FuelType populateFuelTypeDetails(FuelType fuelType);
    City populateCityDetails(City city);
    Location populateLocationDetails(Location location);
}
