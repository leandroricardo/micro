package com.example.micro.user;

import com.example.micro.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    public void delete(long id) {
        if (userRepository.existsById(id))
            userRepository.deleteById(id);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(long id) {
        return userRepository.findById(id);
    }


}
