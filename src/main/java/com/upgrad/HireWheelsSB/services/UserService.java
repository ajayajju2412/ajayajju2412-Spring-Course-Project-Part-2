package com.upgrad.HireWheelsSB.services;

import com.upgrad.HireWheelsSB.entities.Users;
import com.upgrad.HireWheelsSB.exceptions.UserAlreadyExistsException;
import com.upgrad.HireWheelsSB.exceptions.UserDetailsNotFoundException;

public interface UserService {
    Users createUser(Users user) throws UserAlreadyExistsException;
    Users getUser(String email,String password) throws UserDetailsNotFoundException;

}
