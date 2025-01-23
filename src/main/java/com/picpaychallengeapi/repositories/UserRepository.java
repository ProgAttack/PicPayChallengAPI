package com.picpaychallengeapi.repositories;

import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User>findUserByDocument(String document);
	Optional<User>findUserById(Long Id);
	
	
	

}
