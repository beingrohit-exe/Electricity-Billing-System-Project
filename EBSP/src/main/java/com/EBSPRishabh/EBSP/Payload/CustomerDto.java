package com.EBSPRishabh.EBSP.Payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String mobileNumber;
    private Gender gender;
}
