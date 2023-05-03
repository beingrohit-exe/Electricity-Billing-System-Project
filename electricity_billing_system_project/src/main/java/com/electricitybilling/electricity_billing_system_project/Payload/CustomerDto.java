package com.electricitybilling.electricity_billing_system_project.Payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto {

    @Size(min = 2, max = 20)
    private String firstName;
    private String middleName;
    private String lastName;

    @NotBlank
    @Email
    private String email;

    @Size(min = 10, max = 11)
    private String mobileNumber;
    private Gender gender;
}
