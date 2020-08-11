package com.upgrad.HireWheelsSB.daos;


import com.upgrad.HireWheelsSB.entities.Role;
import com.upgrad.HireWheelsSB.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("usersDAO")
public interface UsersDAO extends JpaRepository<Users,Integer> {
    Users findByRole(Role role);
    Users findByEmail(String email);
    Users findByPassword(String password);
    Users findByMobileNo(String mobileNo);
    Users findByEmailAndPassword(String email,String password);
}
