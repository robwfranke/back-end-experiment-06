package nl.lotrac.bv.controller;

import nl.lotrac.bv.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import nl.lotrac.bv.service.CustomerService;
import nl.lotrac.bv.service.BaseService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController


public class BaseController {

    @Autowired
    private CustomerService customerService;
    private BaseController baseService;



    @GetMapping(value = "/")
    public String hello() {
        return "Hello World";
    }


//    public abstract  String createNewCustomer(Customer customer);
    @PostMapping(value="")
   public ResponseEntity<Object>createNewCustomer(@RequestBody Customer customer){

        String newCustomername= customerService.createNewCustomer(customer);
        System.out.println("BaseController, createNewCustomer");

  return ResponseEntity.noContent().build();
    }

}
