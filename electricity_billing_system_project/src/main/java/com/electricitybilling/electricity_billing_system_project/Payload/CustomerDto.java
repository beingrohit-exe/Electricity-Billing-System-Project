package com.electricitybilling.electricity_billing_system_project.Payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author - rohit
 * @project - electricity_billing_system_project
 * @package - com.electricitybilling.electricity_billing_system_project.Payload
 * @created_on - April 30-2023
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private Gender gender;
}
