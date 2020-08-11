package com.upgrad.HireWheelsSB.daos;



import com.upgrad.HireWheelsSB.entities.Booking;
import com.upgrad.HireWheelsSB.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookingDAO")
public interface BookingDAO extends JpaRepository<Booking, Integer> {
    Booking findByUsers(Users users);
}
