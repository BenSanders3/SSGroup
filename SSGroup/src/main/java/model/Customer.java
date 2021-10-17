package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="GROUPID")
	private int custGroupID;
	@Column(name="GROUPSIZE")
	private int groupSize;
	@Column(name="GROUPNAME")
	private String groupName;
	
	public Customer() {
		super();
	}
	public Customer(int custGroupID, int groupSize) {
		super();
		this.custGroupID = custGroupID;
		this.groupSize = groupSize;
	}
	public Customer(int custGroupID, int groupSize, String groupName) {
		super();
		this.custGroupID = custGroupID;
		this.groupSize = groupSize;
		this.groupName = groupName;
	}
	
	
	public int getCustGroupID() {
		return custGroupID;
	}
	public void setCustGroupID(int custGroupID) {
		this.custGroupID = custGroupID;
	}
	public int getGroupSize() {
		return groupSize;
	}
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}
	
	@Override
	public String toString() {
		return "Customer [custGroupID=" + custGroupID + ", groupSize=" + groupSize + ", groupName=" + groupName + "]";
	}
	public String returnCustomerDetails() {
		return this.custGroupID + ": " + this.groupSize + ": " + this.groupName;
	}
	
}