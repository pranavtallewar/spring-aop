package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	private int accountNo;

	private String name;

	public void addAccount() {
		System.out.println(getClass() + " : doing my DB work : Adding an account");
	}

	public String displayText() {
		return getClass() + " displaying text";
	}

	/**
	 * @return the accountNo
	 */
	public int getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo
	 *            the accountNo to set
	 */
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
