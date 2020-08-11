package com.upgrad.HireWheelsSB.entities;



import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class VehicleCategory {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(nullable = false, unique = true)
    private String vehicleCategoryName ;

    @OneToMany(mappedBy = "vehicleCategory",cascade = CascadeType.ALL)
    private List<VehicleSubCategory> vehicleSubCategory;

    public VehicleCategory() {
    }

    public VehicleCategory(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "Id=" + Id +
                ", vehicleCategoryName='" + vehicleCategoryName + '\'' +
                '}';
    }
}
