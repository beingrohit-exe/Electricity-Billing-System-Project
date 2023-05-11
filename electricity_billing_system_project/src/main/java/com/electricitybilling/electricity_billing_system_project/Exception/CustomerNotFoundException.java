package com.electricitybilling.electricity_billing_system_project.Exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CustomerNotFoundException extends RuntimeException {

    /**
     *
     * Customer not found with Id : {customerId}
     *
     * Bill not found with Email : email
     */

    private String field1;
    private String field2;
    private Object object;

    public CustomerNotFoundException(String field1){
        super(String.format("%s", field1));
    }

    public CustomerNotFoundException(String field1, String field2, Object object){
        super(String.format("%s not found with %s : %s", field1, field2, object));
        this.field1 = field1;
        this.field2 = field2;
        this.object = object;
    }
}
