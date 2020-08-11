package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.entities.Booking;
import com.upgrad.HireWheelsSB.exceptions.BookingFailedException;

public interface BookingService {
    Booking addBooking(Booking booking) throws BookingFailedException;
}
