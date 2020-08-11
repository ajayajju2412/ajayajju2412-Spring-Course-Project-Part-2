package com.upgrad.HireWheelsSB;

import com.upgrad.HireWheelsSB.entities.*;
import com.upgrad.HireWheelsSB.services.initService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HireWheelsSbApplication implements CommandLineRunner {
	@Autowired
	initService service;

	public static void main(String[] args) {
		SpringApplication.run(HireWheelsSbApplication.class, args);
	}


	/*============================TODO 8.1===================================*/

	@Override
	public void run(String... arg0){
		Role ADMIN = new Role("ADMIN");
		Role USER = new Role("USER");

		service.populateUserRoleDetails(ADMIN);
		service.populateUserRoleDetails(USER);

		Users user1 = new Users("Admin","Admin","admin@123","upgrad@gmail.com","9999999999",10000.00);
		user1.setRole(ADMIN);

		service.populateUserDetails(user1);

		VehicleCategory CAR = new VehicleCategory("Car");
		VehicleCategory BIKE = new VehicleCategory("Bike");

		service.populateVehicleCategoryDetails(CAR);
		service.populateVehicleCategoryDetails(BIKE);


		VehicleSubCategory SUV = new VehicleSubCategory("SUV",300);
		VehicleSubCategory SEDAN = new VehicleSubCategory("SEDAN",350);
		VehicleSubCategory HATCHBACK = new VehicleSubCategory("HATCHBACK",250);
		VehicleSubCategory CRUISER = new VehicleSubCategory("CRUISER",200);
		VehicleSubCategory DIRTBIKE = new VehicleSubCategory("DIRTBIKE",200);
		VehicleSubCategory SPORTSBIKE = new VehicleSubCategory("SPORTSBIKE",150);

		service.populateVehicleSubCategoryDetails(SUV);
		service.populateVehicleSubCategoryDetails(SEDAN);
		service.populateVehicleSubCategoryDetails(HATCHBACK);
		service.populateVehicleSubCategoryDetails(CRUISER);
		service.populateVehicleSubCategoryDetails(DIRTBIKE);
		service.populateVehicleSubCategoryDetails(SPORTSBIKE);

		FuelType PETROL = new FuelType("Petrol");
		FuelType DIESEL = new FuelType("Diesel");

		service.populateFuelTypeDetails(PETROL);
		service.populateFuelTypeDetails(DIESEL);

		City city = new City("Mumbai");

		service.populateCityDetails(city);

		Location location1 = new Location("Worli","Dr E Moses Rd, Worli Naka, Upper Worli","400018");
		Location location2 = new Location("Chembur","Optic Complex","400019");
		Location location3 = new Location("Powai","Hiranandani Towers","400020");
		location1.setCity(city);
		location2.setCity(city);
		location3.setCity(city);
		service.populateLocationDetails(location1);
		service.populateLocationDetails(location2);
		service.populateLocationDetails(location3);
	}
}
