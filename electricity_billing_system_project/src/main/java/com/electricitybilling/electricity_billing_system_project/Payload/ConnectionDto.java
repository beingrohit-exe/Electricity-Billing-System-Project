package com.electricitybilling.electricity_billing_system_project.Payload;

import com.electricitybilling.electricity_billing_system_project.Entity.Address;
import com.electricitybilling.electricity_billing_system_project.Entity.Customer;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionDto {

    @JsonProperty(value = "type")
    private ConnectionType connectionType;
    private Address address;

}
