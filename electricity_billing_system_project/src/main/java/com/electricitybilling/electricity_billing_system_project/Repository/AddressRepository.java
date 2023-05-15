package com.electricitybilling.electricity_billing_system_project.Repository;

import com.electricitybilling.electricity_billing_system_project.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
