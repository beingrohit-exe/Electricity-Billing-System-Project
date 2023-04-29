package com.electricitybilling.electricity_billing_system_project.Implementation;

import com.electricitybilling.electricity_billing_system_project.Payload.ApiResponse;
import com.electricitybilling.electricity_billing_system_project.Payload.CustomerDto;
import com.electricitybilling.electricity_billing_system_project.Repository.CustomerRepository;
import com.electricitybilling.electricity_billing_system_project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author - rohit
 * @project - electricity_billing_system_project
 * @package - com.electricitybilling.electricity_billing_system_project.Implementation
 * @created_on - April 30-2023
 */

@Service
public class CustomerImplementation implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDto registerCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public CustomerDto getById(Long customerId) {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto, Long customerId) {
        return null;
    }

    @Override
    public ApiResponse deleteCustomer(Long customerId) {
        return null;
    }
}
