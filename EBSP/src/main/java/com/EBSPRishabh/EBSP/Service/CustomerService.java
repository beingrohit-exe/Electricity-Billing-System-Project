package com.EBSPRishabh.EBSP.Service;

import com.EBSPRishabh.EBSP.Entity.Customer;
import com.EBSPRishabh.EBSP.Payload.CustomerDto;
import com.EBSPRishabh.EBSP.Payload.ApiResponse;

import java.util.List;

public interface CustomerService {

    CustomerDto registerCustomer(CustomerDto customerDto);
    CustomerDto getById(Long customerId);
    List<CustomerDto>getAllCustomers();
    CustomerDto updateCustomer(CustomerDto customerDto, Long customerId);
    ApiResponse deleteCustomer(Long customerId);



}
