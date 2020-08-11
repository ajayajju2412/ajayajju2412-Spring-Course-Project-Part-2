package com.upgrad.HireWheelsSB.daos;


import com.upgrad.HireWheelsSB.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cityDAO")
public interface CityDAO extends JpaRepository<City,Integer> {
}
