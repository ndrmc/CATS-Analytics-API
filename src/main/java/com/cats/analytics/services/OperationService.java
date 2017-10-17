package com.cats.analytics.services;

import com.cats.analytics.domain.Operation;

public interface OperationService {
    Iterable<Operation> listAllOperations();
    Operation getOperationById(Integer id );
    Operation saveOperation(Operation dispatch);
    Operation insertOperation(Operation dispatch);
    void deleteOperation(String id);
}
