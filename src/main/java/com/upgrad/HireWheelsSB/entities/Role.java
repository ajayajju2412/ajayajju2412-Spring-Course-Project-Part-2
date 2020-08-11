package com.upgrad.HireWheelsSB.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId ;

    @Column(nullable = false, unique = true)
    private String roleName ;

    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    //@JsonBackReference
    List<Users> users ;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }


    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
