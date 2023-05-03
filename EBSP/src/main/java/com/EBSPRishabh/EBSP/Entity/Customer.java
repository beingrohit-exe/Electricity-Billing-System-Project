package com.EBSPRishabh.EBSP.Entity;


import com.EBSPRishabh.EBSP.Payload.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long customerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String mobileNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
