package com.cats.analytics.services;

import com.cats.analytics.domain.Operation;
import com.cats.analytics.repositories.OperationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
    private OperationRepository operationRepository;
    @Autowired
    private void setOperationRepository(OperationRepository operationRepository){
        this.operationRepository = operationRepository;
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Iterable<Operation> listAllOperations() {
        return operationRepository.findAll();
    }

    @Override
    public Operation getOperationById(Integer id) {
        return null;
    }

    @Override
    public Operation insertOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    @Override
    public Operation saveOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    @Override
    public void deleteOperation(String id) {
        operationRepository.delete(id);
    }
}
