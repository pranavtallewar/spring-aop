package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

	public void addAccount() {
		System.out.println(getClass() + ": doing my DB work : Adding an account");
	}

	public void addSillyAccount() {
		System.out.println(getClass() + " adding silly Member");
	}

	public void addAccount(AccountDao account, int no) {
		System.out.println(getClass() + " adding account");
	}
}
