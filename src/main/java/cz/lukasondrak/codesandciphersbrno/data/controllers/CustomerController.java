package cz.lukasondrak.codesandciphersbrno.data.controllers;

import cz.lukasondrak.codesandciphersbrno.data.entities.Customer;
import cz.lukasondrak.codesandciphersbrno.data.services.CustomerService;
import cz.lukasondrak.codesandciphersbrno.settings.APIEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = APIEndpoint.CUSTOMER)
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(APIEndpoint.NEW_CUSTOMER)
    public ResponseEntity<String> createCustomer(Customer customer) {
        customerService.createCustomer(customer);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = APIEndpoint.ALL_CUSTOMERS)
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.CREATED);
    }
}
