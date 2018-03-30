package com.example.micro;

import com.example.micro.user.UserService;
import com.example.micro.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MicroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userService.createOrUpdateUser(User.builder().name("Leandro").build());
		userService.createOrUpdateUser(User.builder().name("Carlos").build());
		userService.createOrUpdateUser(User.builder().name("Pedro").build());
		userService.createOrUpdateUser(User.builder().name("Jonh").build());
		userService.createOrUpdateUser(User.builder().name("Manuela").build());
		userService.createOrUpdateUser(User.builder().name("Niki").build());
		userService.createOrUpdateUser(User.builder().name("Mike").build());
		userService.createOrUpdateUser(User.builder().name("Maria").build());
	}
}
