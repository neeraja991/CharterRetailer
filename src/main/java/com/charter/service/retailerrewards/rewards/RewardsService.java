package com.charter.service.retailerrewards.rewards;

import java.util.List;

import com.charter.service.retailerrewards.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customers> getCustomerAll() {
		return customerRepository.findAll();
	}
	
	public Customers getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}

}
