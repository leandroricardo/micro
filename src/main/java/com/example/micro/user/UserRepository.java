package com.example.micro.user;

import com.example.micro.user.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByName(@Param(value = "name") String name);

}
