package com.upgrad.HireWheelsSB.entities;



import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class VehicleSubCategory {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(nullable = false, unique = true)
    private String vehicleSubCategoryName ;

    @Column(nullable = false)
    private double pricePerDay ;

    @ManyToOne
    private VehicleCategory vehicleCategory;

    @OneToMany(mappedBy = "vehicleSubCategory",cascade = CascadeType.ALL)
    private List<Vehicle> vehicles;

    public VehicleSubCategory() {
    }

    public VehicleSubCategory(String vehicleSubCategoryName, double pricePerDay) {
        this.vehicleSubCategoryName = vehicleSubCategoryName;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "VehicleSubCategory{" +
                "Id=" + Id +
                ", vehicleSubCategoryName='" + vehicleSubCategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
