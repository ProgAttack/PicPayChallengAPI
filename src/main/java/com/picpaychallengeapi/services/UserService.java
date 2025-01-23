package com.picpaychallengeapi.services;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpaychallengeapi.entities.UserType;
import com.picpaychallengeapi.entities.User;
import com.picpaychallengeapi.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired /*injeção de dependência*/
	private UserRepository repository;

	public void validateTransaction(User sender, BigDecimal amount) throws Exception {
		if(sender.getUserType() == UserType.MERCHANT) {
			throw new Exception("Usuário do tipo logista não está autorizado a realizar transção");
		}
		if (sender.getBalance().compareTo(amount) < 0) {
			throw new Exception("Saldo insuficiente");
		}
	
	}
	
	public User findUserById(Long id) throws Exception {
		return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
	}
	
	
	public void saveUser(User user) {
		this.repository.save(user);
	}
}
