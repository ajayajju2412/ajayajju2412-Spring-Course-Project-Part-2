package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.daos.*;
import com.upgrad.HireWheelsSB.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("initService")
public class initServiceImpl implements initService {

    @Autowired
    @Qualifier("usersDAO")
    UsersDAO usersDAO;

    @Autowired
    @Qualifier("roleDAO")
    RoleDAO roleDAO;

    @Autowired
    @Qualifier("vehicleCategoryDAO")
    VehicleCategoryDAO vehicleCategoryDAO;

    @Autowired
    @Qualifier("vehicleSubCategoryDAO")
    VehicleSubCategoryDAO vehicleSubCategoryDAO;

    @Autowired
    @Qualifier("fuelTypeDAO")
    FuelTypeDAO fuelTypeDAO;

    @Autowired
    @Qualifier("cityDAO")
    CityDAO cityDAO;

    @Autowired
    @Qualifier("locationDAO")
    LocationDAO locationDAO;


    @Override
    public Users populateUserDetails(Users user) {
        return usersDAO.save(user);
    }

    @Override
    public Role populateUserRoleDetails(Role role) {
        return roleDAO.save(role);
    }

    @Override
    public VehicleCategory populateVehicleCategoryDetails(VehicleCategory vehicleCategory) {
        return vehicleCategoryDAO.save(vehicleCategory);
    }

    @Override
    public VehicleSubCategory populateVehicleSubCategoryDetails(VehicleSubCategory vehicleSubCategory) {
        return vehicleSubCategoryDAO.save(vehicleSubCategory);
    }

    @Override
    public FuelType populateFuelTypeDetails(FuelType fuelType) {
        return fuelTypeDAO.save(fuelType);
    }

    @Override
    public City populateCityDetails(City city) {
        return cityDAO.save(city);
    }

    @Override
    public Location populateLocationDetails(Location location) {
        return locationDAO.save(location);
    }

}
