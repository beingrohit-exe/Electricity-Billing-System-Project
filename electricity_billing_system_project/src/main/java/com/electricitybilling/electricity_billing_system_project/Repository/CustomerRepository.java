package com.electricitybilling.electricity_billing_system_project.Repository;

import com.electricitybilling.electricity_billing_system_project.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author - rohit
 * @project - electricity_billing_system_project
 * @package - com.electricitybilling.electricity_billing_system_project.Repository
 * @created_on - April 30-2023
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Boolean existsByEmailEqualsIgnoreCase(String email);
}
