package com.example.Registration.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Registration.Model.UserRegistrationModel;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface RegistrationRepository extends CrudRepository<UserRegistrationModel, Integer> {
	 UserRegistrationModel findByid(int id);

}