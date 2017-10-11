package com.cats.analytics.services;

import com.cats.analytics.domain.User;
import com.cats.analytics.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> listAllUsers() {
        logger.debug("listAllUsers called");
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        logger.debug("getUserById called");
        return userRepository.findOne(id);
    }

    @Override
    public User saveUser(User user) {
        logger.debug("saveUser called");
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        logger.debug("deleteUser called");
        userRepository.delete(id);
    }
}