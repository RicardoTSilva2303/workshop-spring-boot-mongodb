package com.ricardosilva.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardosilva.workshopmongo.domain.User;
import com.ricardosilva.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		// list.add(maria);
		// list.add(alex);	
		// é mesma coisa das duas linhas acima 
		// list.addAll(Arrays.asList(maria,alex));
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
