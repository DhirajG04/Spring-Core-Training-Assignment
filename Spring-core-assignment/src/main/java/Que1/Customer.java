package Que1;

public class Customer {

	int customerId;
	String customerName;
	String customerContact;
	Address customerAddress;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerContact() {
		return customerContact;
	}


	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}


	public Address getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId +"\n"+", customerName=" + customerName +"\n"+ ", customerContact="
				+ customerContact +"\n"+ ", customerAddress=" + customerAddress + "]";
	}


	public Customer(int customerId, String customerName, String customerContact) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}
	
	
	
	
}
