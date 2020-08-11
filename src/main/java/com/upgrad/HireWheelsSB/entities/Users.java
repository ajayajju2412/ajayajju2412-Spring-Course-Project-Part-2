package com.upgrad.HireWheelsSB.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;

    @Column(nullable = false)
    private String firstName ;

    private String lastName ;

    @Column(nullable = false, columnDefinition = "VARCHAR2(50) CHECK (LENGTH(password) > 5)")
    private String password ;

    @Column(nullable = false, unique = true)
    private String email ;

    @Column(nullable = false, unique = true)
    private String mobileNo ;

    @ManyToOne
    private Role role ;

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private List<Booking> booking ;

    @Column(columnDefinition = "NUMBER(10,2) DEFAULT 100000.00")
    private double walletMoney ;



    public Users() {
    }

    public Users(String firstName, String lastName, String password, String email, String mobileNo, double walletMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
        this.walletMoney = walletMoney;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", walletMoney=" + walletMoney +
                '}';
    }
}
