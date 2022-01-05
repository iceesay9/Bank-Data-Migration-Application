
package org.hshinde.data_migration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Customer table in database
 */
@Entity
@Table(name="CUSTOMER")
public class Customer{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="customerName")
	String customerName; 

	@Column(name="email")
	String email;

	@Column(name="accountNumber")
	String accountNumber;

	@Column(name="accountType")
	String accountType;

	@Column(name="accountBalance")
	String accountBalance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Customer() {
		super();
	}
	public Customer(String customerName,String email,String accountNumber,String accountType,String  accountBalance) {
		super();
		this.customerName=customerName;
		this.email=email;
		this.accountNumber=accountNumber;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
