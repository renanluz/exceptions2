package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		validateWithdrawLimit(amount);
		balance = balance - amount;
	}
	
	public void validateWithdrawLimit(double amount) throws DomainException {
		if (amount > getWithdrawLimit()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
	}

}
