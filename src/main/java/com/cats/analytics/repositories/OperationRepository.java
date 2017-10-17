package com.cats.analytics.repositories;

import com.cats.analytics.domain.Operation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperationRepository extends MongoRepository<Operation, String> {

}