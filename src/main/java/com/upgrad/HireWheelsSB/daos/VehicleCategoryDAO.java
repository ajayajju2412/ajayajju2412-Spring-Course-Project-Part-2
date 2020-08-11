package com.upgrad.HireWheelsSB.daos;


import com.upgrad.HireWheelsSB.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleCategoryDAO")
public interface VehicleCategoryDAO extends JpaRepository<VehicleCategory,Integer> {
}
