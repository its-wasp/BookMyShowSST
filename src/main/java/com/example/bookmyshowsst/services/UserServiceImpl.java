package com.example.bookmyshowsst.services;

import com.example.bookmyshowsst.dtos.ResponseStatus;
import com.example.bookmyshowsst.models.User;
import com.example.bookmyshowsst.repositories.UserRepository;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User signup(String name, String email, String password) {
        // first check if user with the given email id is present in the DB or not.

        Optional<User> optionalUser = userRepository.findByEmail(email);

        if(optionalUser.isPresent()){
            // redirect to the login page
            return optionalUser.get();
        }

        // create a new user with the given details and save it to the DB

        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password); // for now storing the password as it is although not a good way.
        // we can use BCryptPasswordEncoder to encode the password before storing it to the DB.


        return userRepository.save(user);
    }

    @Override
    public ResponseStatus login(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if(optionalUser.isEmpty()) {
            // redirect to signup page
            return null;
        }
        User user = optionalUser.get();
        if(user.getPassword().equals(password)){
            // redirect to the home page
            // login successful
            return ResponseStatus.SUCCESS;
        }


        return ResponseStatus.FAILURE;
    }
}
