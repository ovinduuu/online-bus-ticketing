package com.ovindu.ticketbooking.repo;

import com.ovindu.ticketbooking.dto.UserDTO;
import com.ovindu.ticketbooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User>  findById(int userId);
    Optional<User> findByEmailOrNicOrMobile(String email, String nic, String mobile);
    Optional<User> findByEmailAndPassword(String email, String password);
}
