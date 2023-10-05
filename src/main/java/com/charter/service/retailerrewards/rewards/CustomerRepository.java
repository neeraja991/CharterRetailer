package com.charter.service.retailerrewards.rewards;

import com.charter.service.retailerrewards.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}


