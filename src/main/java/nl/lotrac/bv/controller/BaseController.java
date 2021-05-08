package nl.lotrac.bv.controller;

import nl.lotrac.bv.model.Customer;
import nl.lotrac.bv.model.MessageFrontEnd;
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
    private MessageFrontEnd messageFrontEnd = new MessageFrontEnd();



    @GetMapping(value = "/")
    public String hello() {
        return "Hello World";
    }


    @PostMapping(value="")
   public ResponseEntity<Object>createNewCustomer(@RequestBody Customer customer){
        System.out.println("BaseController, createNewCustomer");

        String newCustomername= customerService.createNewCustomer(customer);

        messageFrontEnd.boodschap = ("User: " + newCustomername+ "  created");


  return ResponseEntity.noContent().build();
    }

}
