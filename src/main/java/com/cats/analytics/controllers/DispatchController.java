package com.cats.analytics.controllers;

import com.cats.analytics.domain.Dispatch;
import com.cats.analytics.services.DispatchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by User on 10/12/2017.
 */
@RestController
@RequestMapping("/dispatches")

public class DispatchController {
    private DispatchService dispatchService;

    @Autowired
    public void setDispatchService(DispatchService dispatchService){
        this.dispatchService = dispatchService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Dispatch> dispatchList(){
        Iterable<Dispatch> dispatchList = dispatchService.listAllDispatches();
        return dispatchList;
    }


    @ApiOperation(value = "Add Dispatch")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity insert(@RequestBody Dispatch dispatch) {
        this.dispatchService.insertDispatch(dispatch);
        return new ResponseEntity("Dispatch saved successfully", HttpStatus.OK);


    }
        @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
        public ResponseEntity updateDispatch(@RequestBody Dispatch dispatch){
            this.dispatchService.saveDispatch(dispatch);
            return new ResponseEntity("Dispatch updated successfully", HttpStatus.OK);
        }


        @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
        public ResponseEntity delete(@PathVariable String id){
            dispatchService.deleteDispatch(id);
            return new ResponseEntity("Dispatch deleted successfully", HttpStatus.OK);
    }
}
