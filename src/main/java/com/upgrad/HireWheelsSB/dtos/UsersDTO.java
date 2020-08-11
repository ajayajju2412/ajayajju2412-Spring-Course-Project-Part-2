package com.upgrad.HireWheelsSB.dtos;

import lombok.Data;
import java.util.List;



@Data
public class UsersDTO {
    private int userId ;
    private String firstName ;
    private String lastName ;
    private String password ;
    private String email ;
    private String mobileNo ;
    private int roleId ;
    //private List<Integer> bookingIds ;
    private double walletMoney ;
}
