package com.upgrad.HireWheelsSB.entities;



import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuelTypeId ;

    @Column(nullable = false, unique = true)
    private String fuelType ;

    @OneToMany(mappedBy = "fuelType",cascade = CascadeType.ALL)
    List<Vehicle> vehicle;

    public FuelType() {
    }

    public FuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "fuelTypeId=" + fuelTypeId +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
