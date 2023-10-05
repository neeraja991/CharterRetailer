package com.charter.service.retailerrewards.rewards;

import java.util.List;

import com.charter.service.retailerrewards.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.charter.service.retailerrewards.model.Customers;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RewardsController {
	
	@Autowired
	private RewardsService rewardsService;
	
	@GetMapping("/customers")
	public List<Customers> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customers> getCustomer(@PathVariable Integer id) {
		Customers customer = rewardsService.getCustomerById(id);
		if (customer == null) return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customers>(customer, HttpStatus.OK);
	}
	
	
}




