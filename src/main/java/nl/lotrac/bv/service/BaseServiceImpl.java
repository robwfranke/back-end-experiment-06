package nl.lotrac.bv.service;

import nl.lotrac.bv.model.Customer;
import nl.lotrac.bv.repository.BaseRepository;
import nl.lotrac.bv.repository.CustomerRepository;
import nl.lotrac.bv.utils.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BaseServiceImpl implements BaseService{


    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BaseRepository baseRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @Override
//
//    public String createNewCustomer (Customer customer){
//
//        System.out.println("create newCustomer");
//
//
//        String randomString = RandomStringGenerator.generateAlphaNumeric(20);
//        customer.setApikey(randomString);
//        Customer newCustomer=customerRepository.save(customer);
//        return (newCustomer.getCustomername());
//
//    }


}
