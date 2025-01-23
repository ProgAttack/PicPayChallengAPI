package com.picpaychallengeapi.entities;

import java.math.BigDecimal;

import com.picpaychallengeapi.dtos.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor


public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	
	@Column(unique = true)
	private String document;
	
	@Column(unique = true)
	private String email;
	
	private String password; /*Spring Security*/
	
	private BigDecimal balance; /* saldo */
	
	
	@Enumerated(EnumType.STRING) /* representa um dos valores merchant ou common */
	private UserType userType;



	
	public  User(UserDTO data) {
		this.firstName = data.firstName();
		this.lastName = data.lastName();
		this.document = data.document();
		this.balance = data.balance();
		this.email = data.email();
		this.password = data.password();
		this.userType = data.userType();
		this.document = data.document();
		
	}
	
	
	
	
}
