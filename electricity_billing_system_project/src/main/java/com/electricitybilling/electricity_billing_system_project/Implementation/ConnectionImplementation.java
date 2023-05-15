package com.electricitybilling.electricity_billing_system_project.Implementation;

import com.electricitybilling.electricity_billing_system_project.Constants.ConnectionConstants;
import com.electricitybilling.electricity_billing_system_project.Entity.Connection;
import com.electricitybilling.electricity_billing_system_project.Entity.Customer;
import com.electricitybilling.electricity_billing_system_project.Exception.CustomerNotFoundException;
import com.electricitybilling.electricity_billing_system_project.Logic.ServiceLogics;
import com.electricitybilling.electricity_billing_system_project.Payload.ApiResponse;
import com.electricitybilling.electricity_billing_system_project.Payload.ConnectionDto;
import com.electricitybilling.electricity_billing_system_project.Payload.ConnectionType;
import com.electricitybilling.electricity_billing_system_project.Repository.AddressRepository;
import com.electricitybilling.electricity_billing_system_project.Repository.ConnectionRepository;
import com.electricitybilling.electricity_billing_system_project.Repository.CustomerRepository;
import com.electricitybilling.electricity_billing_system_project.Service.ConnectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class ConnectionImplementation implements ConnectionService<Object> {

    private final ConnectionRepository connectionRepository;
    private final CustomerRepository customerRepository;
    private final AddressRepository addressRepository;

//    public ConnectionImplementation(ConnectionRepository connectionRepository){
//        this.connectionRepository = connectionRepository;
//    }

    @Override
    public Object applyConnection(ConnectionDto connectionDto, Long customerId) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new CustomerNotFoundException("Customer", "Id", customerId));
        String connectionType = connectionDto.getConnectionType().toString();
        String consumerNumber = ServiceLogics.getConsumerNumber(connectionType);
        Connection connection = Connection
                .builder()
                .appliedDate(new Date(System.currentTimeMillis()))
                .address(connectionDto.getAddress())
                .consumerNo(consumerNumber)
                .customer(customer)
                .connectionType(connectionDto.getConnectionType())
                .build();
        Connection save = connectionRepository.save(connection);
        return ApiResponse
                .builder()
                .message("Appication Submitted Successfully for Consumer Number : "+ consumerNumber)
                .isApplied(true)
                .build();
    }



    @Override
    public Object getConnection(Integer connectionId) {
        return null;
    }

    @Override
    public Object getAll(Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public Object deleteConnection(Integer connectionId) {
        return null;
    }

    @Override
    public String getTypeFromConsumerNumber(String consumerNumber) {
        return null;
    }
}
