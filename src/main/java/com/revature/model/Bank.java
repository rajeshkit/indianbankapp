package com.revature.model;

public class Bank {
	private int bankId;
	private String bankName;
	private String branchName;
	private String city;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankId, String bankName, String branchName, String city) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
		this.city = city;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
