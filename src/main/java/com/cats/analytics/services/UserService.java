package com.cats.analytics.services;

import com.cats.analytics.domain.User;

public interface UserService {
    Iterable<User> listAllUsers();

    User getUserById(Integer id);

    User saveUser(User product);

    void deleteUser(Integer id);
}

