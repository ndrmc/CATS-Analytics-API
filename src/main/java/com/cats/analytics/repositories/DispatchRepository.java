package com.cats.analytics.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cats.analytics.domain.Dispatch;

/**
 * Created by User on 10/12/2017.
 */
public interface DispatchRepository extends MongoRepository<Dispatch, String> {

}

