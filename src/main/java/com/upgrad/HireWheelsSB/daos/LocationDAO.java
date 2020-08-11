package com.upgrad.HireWheelsSB.daos;


import com.upgrad.HireWheelsSB.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("locationDAO")
public interface LocationDAO extends JpaRepository<Location,Integer> {
}
