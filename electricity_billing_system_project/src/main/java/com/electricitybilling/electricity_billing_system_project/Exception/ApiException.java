package com.electricitybilling.electricity_billing_system_project.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiException extends RuntimeException {

    private String message;
    private HttpStatus statusCode;
}
