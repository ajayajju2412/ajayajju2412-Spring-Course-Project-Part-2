package com.upgrad.HireWheelsSB.entities;



import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityId ;

    @Column(nullable = false)
    private String cityName ;

    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private List<Location> location;

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }


    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
