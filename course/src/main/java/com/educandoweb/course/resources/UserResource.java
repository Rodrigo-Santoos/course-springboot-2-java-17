package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//definindo que aqui é um controler rest
@RestController

//caminho /users na web
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	// ResponseEntity é para retorna resposta web
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Rodrigo", "rodrigo@gmail.com", "1199999999", "1234");
		return ResponseEntity.ok().body(u);
	}
	
}
