package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.daos.BookingDAO;
import com.upgrad.HireWheelsSB.daos.UsersDAO;
import com.upgrad.HireWheelsSB.entities.Booking;
import com.upgrad.HireWheelsSB.entities.Users;
import com.upgrad.HireWheelsSB.exceptions.BookingFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("bookingService")
public class BookingServiceImpl implements BookingService{

    @Autowired
    @Qualifier("bookingDAO")
    BookingDAO bookingDAO;

    @Autowired
    @Qualifier("usersDAO")
    UsersDAO usersDAO;

    /*============================TODO 6.2===================================*/

    @Override
    public Booking addBooking(Booking booking) throws BookingFailedException {
        Users bookingUser = booking.getUsers();
        if(bookingUser.getWalletMoney() < booking.getAmount()){
            throw new BookingFailedException("Insufficient Balance. Please Check With Admin");
        }

        Double updatedWallet= bookingUser.getWalletMoney() - booking.getAmount();
        bookingUser.setWalletMoney(updatedWallet);
        usersDAO.save(bookingUser);
        Booking savedBooking = bookingDAO.save(booking);
        return savedBooking;
    }
}
