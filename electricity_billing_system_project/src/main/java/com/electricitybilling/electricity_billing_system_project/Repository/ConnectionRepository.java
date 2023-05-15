package com.electricitybilling.electricity_billing_system_project.Repository;

import com.electricitybilling.electricity_billing_system_project.Entity.Connection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectionRepository extends JpaRepository<Connection, Integer> {
}
