package nl.lotrac.bv.controller;

import nl.lotrac.bv.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController


public class BaseController {

    @CrossOrigin(origins = "http://localhost:3000")

    @GetMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

    @PostMapping(value="")
   public ResponseEntity<Object>createNewCustomer(@RequestBody Customer customer){
        System.out.println("BaseController, createNewCustomer");

  return ResponseEntity.noContent().build();
    }

}
