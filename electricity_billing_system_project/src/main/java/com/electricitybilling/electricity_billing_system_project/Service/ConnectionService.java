package com.electricitybilling.electricity_billing_system_project.Service;

import com.electricitybilling.electricity_billing_system_project.Entity.Connection;
import com.electricitybilling.electricity_billing_system_project.Payload.ApiResponse;
import com.electricitybilling.electricity_billing_system_project.Payload.ConnectionDto;

import java.util.Map;

public interface ConnectionService<A> {
    A applyConnection(ConnectionDto connectionDto, Long customerId);
    A getConnection(Integer connectionId);
    A getAll(Integer pageNumber, Integer pageSize);
    A deleteConnection(Integer connectionId);
    String getTypeFromConsumerNumber(String consumerNumber);
}
