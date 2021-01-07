package com.altimetrik.training.controller;

import com.altimetrik.training.model.Customer;
import com.altimetrik.training.model.Order;
import com.altimetrik.training.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

import static com.altimetrik.training.Constants.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(BASE_CUSTOMER_URI)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping(GET_CUSTOMER_BY_ID_URI)
    public Optional<Customer> getCustomer(Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @PostMapping(BASE_CUSTOMER_URI)
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addOrUpdateCustomer(customer);
    }

    @PutMapping(GET_CUSTOMER_BY_ID_URI)
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.addOrUpdateCustomer(customer);
    }

    @DeleteMapping(GET_CUSTOMER_BY_ID_URI)
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable Long customerId) {
        customerService.deleteCustomer(customerId);
    }

}
