package com.example.Registration.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Registration.Model.UserRegistrationModel;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface RegistrationRepository extends JpaRepository<UserRegistrationModel, String> {
	 UserRegistrationModel findByid(String id);

}