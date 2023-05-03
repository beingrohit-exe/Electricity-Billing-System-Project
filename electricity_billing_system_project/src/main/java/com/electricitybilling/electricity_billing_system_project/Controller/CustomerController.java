package com.electricitybilling.electricity_billing_system_project.Controller;

import com.electricitybilling.electricity_billing_system_project.Payload.CustomerDto;
import com.electricitybilling.electricity_billing_system_project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author - rohit
 * @project - electricity_billing_system_project
 * @package - com.electricitybilling.electricity_billing_system_project.Controller
 * @created_on - April 30-2023
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public CustomerDto register(@Valid @RequestBody CustomerDto customerDto){
//        CustomerDto customer = customerService.registerCustomer(customerDto);
//        return customer;
//    }

    @PostMapping
    public ResponseEntity<CustomerDto> register(@Valid @RequestBody CustomerDto customerDto){
        CustomerDto customer = customerService.registerCustomer(customerDto);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

//    @PostMapping
//    public ResponseEntity<CustomerDto> register(@Valid @RequestBody CustomerDto customerDto){
//        CustomerDto customer = customerService.registerCustomer(customerDto);
//        return ResponseEntity.ok(customer);
//    }
}
