package com.cats.analytics.repositories;

import com.cats.analytics.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
    User findByName(String name);
}
