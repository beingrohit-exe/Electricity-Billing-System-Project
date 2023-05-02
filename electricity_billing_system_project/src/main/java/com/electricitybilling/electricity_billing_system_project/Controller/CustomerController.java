package com.electricitybilling.electricity_billing_system_project.Controller;

import com.electricitybilling.electricity_billing_system_project.Payload.CustomerDto;
import com.electricitybilling.electricity_billing_system_project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping
    public CustomerDto register(@RequestBody CustomerDto customerDto){
        CustomerDto customer = customerService.registerCustomer(customerDto);
        return customer;
    }
}
