package com.EBSPRishabh.EBSP.Repository;

import com.EBSPRishabh.EBSP.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
