package com.cats.analytics.controllers;

import com.cats.analytics.domain.Operation;
import com.cats.analytics.services.OperationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operations")
public class OperationController {

    private OperationService operationService;

    @Autowired
    public void setOperationService(OperationService operationService){
        this.operationService = operationService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Operation> operationList(){
        Iterable<Operation> operationList = operationService.listAllOperations();
        return operationList;
    }


    @ApiOperation(value = "Add Operation")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity insert(@RequestBody Operation operation) {
        this.operationService.insertOperation(operation);
        return new ResponseEntity("Operation saved successfully", HttpStatus.OK);


    }
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity updateOperation(@RequestBody Operation operation){
        this.operationService.saveOperation(operation);
        return new ResponseEntity("Operation updated successfully", HttpStatus.OK);
    }


    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable String id){
        operationService.deleteOperation(id);
        return new ResponseEntity("Operation deleted successfully", HttpStatus.OK);
    }
}
