package nl.lotrac.bv.service;


import nl.lotrac.bv.exceptions.RecordNotFoundException;
import nl.lotrac.bv.model.Customer;
import nl.lotrac.bv.repository.CustomerRepository;
import nl.lotrac.bv.utils.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;





    @Override
    public Collection<Customer> getCustomers() {

        return customerRepository.findAll();
    }


@Override
    public Customer getCustomer(Long id) {

    System.out.println("CustomerServiceImpl");
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isEmpty()) {
            throw new RecordNotFoundException();
        } else {
            return customer.get();
        }
    }




    @Override

    public String createNewCustomer (Customer customer){

        System.out.println("CustomerService Impl create newCustomer");


        String randomString = RandomStringGenerator.generateAlphaNumeric(20);
        customer.setApikey(randomString);
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        Customer newCustomer=customerRepository.save(customer);
        return (newCustomer.getCustomername());

    }




}
