package com.upgrad.HireWheelsSB.entities;



import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId ;

    @Column(nullable = false)
    private String locationName ;

    @Column(nullable = false)
    private String address ;

    @ManyToOne
    private City city;

    @Column(nullable = false)
    private String pincode ;

    @OneToMany(mappedBy = "location",cascade = CascadeType.ALL)
    private List<Vehicle> vehicle ;

    @OneToMany(mappedBy = "location",cascade = CascadeType.ALL)
    private List<Booking> booking ;

    public Location() {
    }

    public Location(String locationName, String address, String pincode) {
        this.locationName = locationName;
        this.address = address;
        this.pincode = pincode;
    }


    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
