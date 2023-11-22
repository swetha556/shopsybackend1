package com.dxc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByUseremailAndUserpasswordAndRole(String useremail,String userpassword,String role);
}
