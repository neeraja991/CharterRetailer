package com.charter.service.retailerrewards.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CustomerTransact extends Reward{
	@Id
	@GeneratedValue
	private Long id;

	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private Customers customer;

	private Double total;
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date saveDate;
	
	
	public CustomerTransact() {
		super();
	}
	public CustomerTransact(Long id, Customers customer, Double total, String description, Date date) {
		super();
		this.id = id;
		this.customer = customer;
		this.total = total;
		this.description = description;
		this.saveDate = date;
	}

	public Date getSaveDate() {
		return saveDate;
	}
	public void setSaveDate(Date saveDate) {
		this.saveDate = saveDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	//Business logic for calculation
	@Override
	public Long getPoints() {
		this.points = 0l;
		
		if (this.total > 50 && this.total <= 100) {
			this.points += (this.total.intValue() - 50) * 1;
		}
		else if (this.total > 100) {
			this.points += 50;
			this.points += (this.total.intValue() - 100) * 2;
		}
		
		return this.points;
	}
	
	@Override
	public String toString() {
		return String.format("CustomerTransaction [id=%s, customer=%s, total=%s, description=%s, saveDate=%s]", id, customer,
				total, description, saveDate);
	}
	
}


