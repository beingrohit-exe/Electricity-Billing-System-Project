package com.electricitybilling.electricity_billing_system_project.Controller;

import com.electricitybilling.electricity_billing_system_project.Payload.ApiResponse;
import com.electricitybilling.electricity_billing_system_project.Payload.CustomerDto;
import com.electricitybilling.electricity_billing_system_project.Payload.PagedResponse;
import com.electricitybilling.electricity_billing_system_project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.function.Supplier;

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
    public ResponseEntity<CustomerDto> register(@Valid @RequestBody CustomerDto customerDto){
        CustomerDto customer = customerService.registerCustomer(customerDto);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getById(@PathVariable Long customerId){
        return ResponseEntity.ok(customerService.getById(customerId));
    }

    @GetMapping
    public ResponseEntity<?> allCustomers(@RequestParam(name = "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
    @RequestParam(name = "pageSize", defaultValue = "10", required = false) Integer pageSize){
        return ResponseEntity.ok(customerService.getAllCustomers(pageNumber, pageSize));
    }

    @DeleteMapping("/{customerId}")
    public ApiResponse deleteById(@PathVariable Long customerId){
        return customerService.deleteCustomer(customerId);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<?> updateCustomer(@PathVariable Long customerId, @RequestBody CustomerDto customerDto){
        CustomerDto customer = customerService.updateCustomer(customerDto, customerId);
        return ResponseEntity.created(getUri.get()).body(customer);
    }

    private Supplier<URI> getUri = () -> ServletUriComponentsBuilder.fromCurrentContextPath().path("/customer").host("www.google.com").port("567").build().toUri();

    // Alt + Enter -> Extra Features
    // Ctrl/Command + Alt + V -> Assign to new local variable
    // --------"--------- + L -> Format Code
    // --------"--------- + O -> Remove unused imports
    // Alt + Insert -> Generate
}
