package com.picpaychallengeapi.dtos;

import java.math.BigDecimal;

import com.picpaychallengeapi.entities.UserType;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
	
	

}
