package cz.lukasondrak.codesandciphersbrno.data.services;

import cz.lukasondrak.codesandciphersbrno.data.entities.Customer;
import cz.lukasondrak.codesandciphersbrno.data.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }


    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
}
