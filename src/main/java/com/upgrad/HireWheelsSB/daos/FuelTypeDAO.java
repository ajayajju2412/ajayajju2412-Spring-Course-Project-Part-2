package com.upgrad.HireWheelsSB.daos;


import com.upgrad.HireWheelsSB.entities.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("fuelTypeDAO")
public interface FuelTypeDAO extends JpaRepository<FuelType,Integer> {
}
