package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.daos.UsersDAO;
import com.upgrad.HireWheelsSB.entities.Users;
import com.upgrad.HireWheelsSB.exceptions.UserAlreadyExistsException;
import com.upgrad.HireWheelsSB.exceptions.UserDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("usersDAO")
    UsersDAO usersDAO;

    /*========================TODO 4.4================================*/

    @Override
    public Users createUser(Users user) throws UserAlreadyExistsException {
       Users savedUserEmail = usersDAO.findByEmail(user.getEmail());
       Users savedUserMobile = usersDAO.findByMobileNo(user.getMobileNo());
        if(savedUserEmail != null && savedUserMobile != null){
            throw new UserAlreadyExistsException("Email and Mobile Number Already Exists");
        }
       else if(savedUserEmail != null){
           throw new UserAlreadyExistsException("Email Already Exists");
       }
       else if(savedUserMobile != null){
           throw new UserAlreadyExistsException("Mobile Number Already Exists");
       }
       Users savedUser = usersDAO.save(user);
        return savedUser;
    }

    /*========================TODO 4.5================================*/

    @Override
    public Users getUser(String email, String password) throws UserDetailsNotFoundException {
        Users savedUser = usersDAO.findByEmail(email);

        if(savedUser == null){
            throw new UserDetailsNotFoundException("User not Registered");
        }
        else if(password.equals(savedUser.getPassword()) == false){
            throw new UserDetailsNotFoundException("Unauthorized User");
        }
        return savedUser;
    }




}
