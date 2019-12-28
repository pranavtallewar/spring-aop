package com.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDao;
import com.aopdemo.dao.MembershipDao;

public class MainDemo {

	public static void main(String[] args) {
		// read spring config java
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get bean from spring container
		AccountDao accountDao = context.getBean("accountDao", AccountDao.class);

		// call business methods
		accountDao.addAccount();

		System.out.println();
		System.out.println(accountDao.displayText());

		System.out.println();

		MembershipDao memberShipDao = context.getBean("membershipDao", MembershipDao.class);
		memberShipDao.addAccount();
		System.out.println();
		memberShipDao.addSillyAccount();
		System.out.println();
		memberShipDao.addAccount(accountDao, 1);
		// close context
		context.close();
	}

}
