package com.electricitybilling.electricity_billing_system_project.Payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

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
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

    private String message;
    private Boolean isSuccess;
    private Boolean isApplied;
    private Boolean isDeleted;
    private Boolean isUpdated;
    private Boolean isError;
}
