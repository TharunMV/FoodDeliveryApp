package com.altimetrik.training.service;

import com.altimetrik.training.model.Customer;
import com.altimetrik.training.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomer(Long customerId) {
        return customerRepository.findById(customerId);
    }

    public void addOrUpdateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

}
