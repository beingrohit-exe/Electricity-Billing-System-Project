package com.electricitybilling.electricity_billing_system_project.Service;

import com.electricitybilling.electricity_billing_system_project.Payload.ApiResponse;
import com.electricitybilling.electricity_billing_system_project.Payload.CustomerDto;

import java.util.List;

/**
 * @author - rohit
 * @project - electricity_billing_system_project
 * @package - com.electricitybilling.electricity_billing_system_project.Service
 * @created_on - April 30-2023
 */

public interface CustomerService {

    CustomerDto registerCustomer(CustomerDto customerDto);
    CustomerDto getById(Long customerId);
    List<CustomerDto> getAllCustomers();
    CustomerDto updateCustomer(CustomerDto customerDto, Long customerId);
    ApiResponse deleteCustomer(Long customerId);
}
