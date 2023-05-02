package com.electricitybilling.electricity_billing_system_project.Implementation;

import com.electricitybilling.electricity_billing_system_project.Entity.Customer;
import com.electricitybilling.electricity_billing_system_project.Payload.ApiResponse;
import com.electricitybilling.electricity_billing_system_project.Payload.CustomerDto;
import com.electricitybilling.electricity_billing_system_project.Repository.CustomerRepository;
import com.electricitybilling.electricity_billing_system_project.Service.CustomerService;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

//    @Override
//    public CustomerDto registerCustomer(CustomerDto customerDto) {
//
//        //Creating customer object so that we can set all the properties
//        Customer customer = new Customer();
//
//        //Converting CustomerDto to Customer Entity
//        customer.setFirstName(customerDto.getFirstName());
//        customer.setMiddleName(customerDto.getMiddleName());
//        customer.setLastName(customerDto.getLastName());
//        customer.setEmail(customerDto.getEmail());
//        customer.setMobileNumber(customerDto.getMobileNumber());
//        customer.setGender(customerDto.getGender());
//
//        //Entry to database for Customer
//        Customer savedCustomer = customerRepository.save(customer);
//
//        //Creating new CustomerDto Object
//        CustomerDto savedDto = new CustomerDto();
//
//        //Converting Customer Entity to CustomerDto because our return type CustomerDto
//        savedDto.setFirstName(savedCustomer.getFirstName());
//        savedDto.setMiddleName(savedCustomer.getMiddleName());
//        savedDto.setLastName(savedCustomer.getLastName());
//        savedDto.setMobileNumber(savedCustomer.getMobileNumber());
//        savedDto.setGender(savedCustomer.getGender());
//        savedDto.setEmail(savedCustomer.getEmail());
//
//        //Returning CustomerDto
//        return savedDto;
//    }

//    @Override
//    public CustomerDto registerCustomer(CustomerDto customerDto) {
//
//        //Converting CustomerDto to Entity
//        Customer customer = dtoToEntity(customerDto);
//
//        //Entry to database for Customer
//        Customer savedCustomer = customerRepository.save(customer);
//
//        //Converting Entity to CustomerDto
//        CustomerDto customer1 = customerToDto(savedCustomer);
//
//        //Returning CustomerDto
//        return customer1;
//    }

    //Curl -> curl -X POST http://localhost:8000/customer -H "Content-Type:application/json" -d "{\"firstName\":\"Rohit\",\"lastName\":\"Parihar\",\"email\":\"rohit@gmail.com\",\"mobileNumber\":\"78755455\",\"gender\":\"MALE\"}"
    //Curl Powershell ->  curl -X POST 'http://localhost:8000/customer' -H 'Content-Type:application/json' -d '{\"firstName\":\"Rohit\",\"lastName\":\"Parihar\",\"email\":\"rohit@gmail.com\",\"mobileNumber\":\"78755455\",\"gender\":\"MALE\"}'
    @Override
    public CustomerDto registerCustomer(CustomerDto customerDto) {

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

    private Customer dtoToEntity(CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setMiddleName(customerDto.getMiddleName());
        customer.setLastName(customerDto.getLastName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        customer.setGender(customerDto.getGender());
        return customer;
    }

    private static CustomerDto customerToDto(Customer savedCustomer) {
        //Creating new CustomerDto Object
        CustomerDto savedDto = new CustomerDto();

        //Converting Customer Entity to CustomerDto because our return type CustomerDto
        savedDto.setFirstName(savedCustomer.getFirstName());
        savedDto.setMiddleName(savedCustomer.getMiddleName());
        savedDto.setLastName(savedCustomer.getLastName());
        savedDto.setMobileNumber(savedCustomer.getMobileNumber());
        savedDto.setGender(savedCustomer.getGender());
        savedDto.setEmail(savedCustomer.getEmail());
        return savedDto;
    }
}
