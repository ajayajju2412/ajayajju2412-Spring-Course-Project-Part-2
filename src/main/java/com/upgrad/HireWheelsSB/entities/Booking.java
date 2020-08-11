package com.upgrad.HireWheelsSB.entities;



import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId ;

    @Column(nullable = false)
    private Date pickupDate ;

    @Column(nullable = false)
    private Date dropOffDate ;

    @Column(nullable = false)
    private Date bookingDate ;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    private Location location;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Users users;

    public Booking() {
    }

    public Booking(Date pickupDate, Date dropoffDate, Date bookingDate, double amount) {
        this.pickupDate = pickupDate;
        this.dropOffDate = dropoffDate;
        this.bookingDate = bookingDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", pickupDate=" + pickupDate +
                ", dropOffDate=" + dropOffDate +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                '}';
    }
}
