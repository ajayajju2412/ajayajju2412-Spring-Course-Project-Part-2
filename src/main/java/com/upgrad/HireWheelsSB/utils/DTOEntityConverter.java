package com.upgrad.HireWheelsSB.utils;

import com.upgrad.HireWheelsSB.daos.RoleDAO;
import com.upgrad.HireWheelsSB.dtos.UsersDTO;
import com.upgrad.HireWheelsSB.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DTOEntityConverter {
    @Autowired
    RoleDAO roleDAO;

    public Users convertUserDTOToUser(UsersDTO usersDTO){
        Users users = new Users();
        users.setRole(roleDAO.findById(usersDTO.getRoleId()).get());
        users.setWalletMoney(usersDTO.getWalletMoney());
        //users.setBooking(usersDTO.getBookingIds());
        users.setEmail(usersDTO.getEmail());
        users.setFirstName(usersDTO.getFirstName());
        users.setLastName(usersDTO.getLastName());
        users.setMobileNo(usersDTO.getMobileNo());
        users.setPassword(usersDTO.getPassword());
        users.setUserId(usersDTO.getUserId());
        return users;
    }
}
