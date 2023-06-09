package com.electricitybilling.electricity_billing_system_project.Entity;

import com.electricitybilling.electricity_billing_system_project.Payload.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author - rohit
 * @project - electricity_billing_system_project
 * @package - com.electricitybilling.electricity_billing_system_project.Entity
 * @created_on - April 29-2023
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String middleName;
    private String lastName;

    @Column(unique = true)
    private String email;
    private String mobileNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
