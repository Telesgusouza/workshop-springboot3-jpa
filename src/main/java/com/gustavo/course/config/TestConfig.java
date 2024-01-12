package com.gustavo.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gustavo.course.entities.User;
import com.gustavo.course.repositories.UserRepository;

// CommandLineRunner fara que nossa aplicação rode sem precisar instanciar ela
@Configuration
@Profile("test") 
public class TestConfig implements CommandLineRunner {

	// como você pode ver eu uso uma class de uma outra pasta, essa class se torna minha dependencia, e para as 
	// dependencias precisamos fazer uma anotação chamada @Autowirede
	// o userRepository esta acessando os dados
	@Autowired
	private UserRepository userRepository;

	// tudo que for colocado dentro desta aplicação sera rodado assim que a aplicação executar
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		// adicionar uma lista de objetos para o banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
