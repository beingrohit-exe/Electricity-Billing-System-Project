package com.electricitybilling.electricity_billing_system_project.Implementation;

import com.electricitybilling.electricity_billing_system_project.Entity.Customer;
import com.electricitybilling.electricity_billing_system_project.Exception.ApiException;
import com.electricitybilling.electricity_billing_system_project.Payload.ApiResponse;
import com.electricitybilling.electricity_billing_system_project.Payload.CustomerDto;
import com.electricitybilling.electricity_billing_system_project.Repository.CustomerRepository;
import com.electricitybilling.electricity_billing_system_project.Service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @Autowired
    private ModelMapper modelMapper;

    //Curl -> curl -X POST http://localhost:8000/customer -H "Content-Type:application/json" -d "{\"firstName\":\"Rohit\",\"lastName\":\"Parihar\",\"email\":\"rohit@gmail.com\",\"mobileNumber\":\"78755455\",\"gender\":\"MALE\"}"
    //Curl Powershell ->  curl -X POST 'http://localhost:8000/customer' -H 'Content-Type:application/json' -d '{\"firstName\":\"Rohit\",\"lastName\":\"Parihar\",\"email\":\"rohit@gmail.com\",\"mobileNumber\":\"78755455\",\"gender\":\"MALE\"}'
    @Override
    public CustomerDto registerCustomer(CustomerDto customerDto) {

        //Checking if already Exists
        if (customerRepository.existsByEmailEqualsIgnoreCase(customerDto.getEmail())){
            throw new ApiException("Email already Exists in database", HttpStatus.NOT_ACCEPTABLE);
        }

        Customer customer = modelMapper.map(customerDto, Customer.class);

        //Entry to database for Customer
        Customer savedCustomer = customerRepository.save(customer);

        CustomerDto customer2 = modelMapper.map(savedCustomer, CustomerDto.class);

        //Returning CustomerDto
        return customer2;
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
