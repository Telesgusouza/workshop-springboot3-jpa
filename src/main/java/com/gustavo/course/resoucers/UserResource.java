package com.gustavo.course.resoucers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.course.entities.User;
import com.gustavo.course.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	// já que é nescessario passar um id então passamos por aqui também
	// também precisamos passar um novo @ para a variavel, isso para dizer que o id do 
	// prametro também vai na url
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
