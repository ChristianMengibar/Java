package org.iesfm.bank.controller;

import org.iesfm.bank.Customer;
import org.iesfm.bank.repository.AccountRepository;
import org.iesfm.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/customers")
    public List<Customer> list() {
        return customerRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/customers")
    public void insert(@RequestBody Customer customer) {
        if (customerRepository.existsByNif(customer.getNif())) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Ya existe un cliente con el nif " + customer.getNif());
        } else {
            customerRepository.save(customer);
        }
    }

    @Transactional
    @RequestMapping(method = RequestMethod.DELETE, path = "/customers/{nif}")
    public void delete(@PathVariable("nif") String nif) {
        int deletedRows = customerRepository.deleteByNif(nif);
        if (deletedRows == 0) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "");
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/customers/{nif}")
    public Customer getCustomer(@PathVariable("nif") String nif) {
        Optional<Customer> customer = customerRepository.findOneByNif(nif);

        return customer
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "")
                );
    }
}
