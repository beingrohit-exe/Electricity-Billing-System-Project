package com.EBSPRishabh.EBSP.Implementation;

import com.EBSPRishabh.EBSP.Entity.Customer;
import com.EBSPRishabh.EBSP.Payload.ApiResponse;
import com.EBSPRishabh.EBSP.Payload.CustomerDto;
import com.EBSPRishabh.EBSP.Repository.CustomerRepository;
import com.EBSPRishabh.EBSP.Service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImplementation implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CustomerDto registerCustomer(CustomerDto customerDto) {
        Customer customer=modelMapper.map(customerDto, Customer.class);
        Customer savedCustomer=customerRepository.save(customer);
        CustomerDto customer2 = modelMapper.map(savedCustomer,CustomerDto.class);
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
