package com.apurvan.registration;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Customer {
	private Integer customerId;
	private String customerName;
	private String customerEmail;
	private String customerPassword;
	private Long customerPhoneNo;
}
