package com.upgrad.HireWheelsSB.controllers;

import com.upgrad.HireWheelsSB.dtos.UsersDTO;
import com.upgrad.HireWheelsSB.entities.Users;
import com.upgrad.HireWheelsSB.exceptions.GlobalExceptionHandler;
import com.upgrad.HireWheelsSB.exceptions.UserAlreadyExistsException;
import com.upgrad.HireWheelsSB.responseModel.CustomResponse;
import com.upgrad.HireWheelsSB.services.UserService;
import com.upgrad.HireWheelsSB.utils.DTOEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;



@RestController
@RequestMapping("/users")
public class AuthController {
    @Autowired
    UserService userService;

    @Autowired
    DTOEntityConverter dtoEntityConverter;

    /*============================TODO 8.2===================================*/


    @PostMapping
    public ResponseEntity<Object> userSignUp(@RequestBody UsersDTO usersDTO) throws GlobalExceptionHandler, UserAlreadyExistsException {
        ResponseEntity responseEntity = null;
        Users newUser = dtoEntityConverter.convertUserDTOToUser(usersDTO);
        Users savedUser = userService.createUser(newUser);
        if (savedUser != null) {
            CustomResponse response = new CustomResponse(new Date(), "User Successfully Signed Up", 200);
            responseEntity = new ResponseEntity(response, HttpStatus.CREATED);
        }
        return responseEntity;

    }

}
