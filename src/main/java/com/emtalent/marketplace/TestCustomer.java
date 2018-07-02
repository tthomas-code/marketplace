package com.emtalent.marketplace;

import com.emtalent.marketplace.domain.Customer;

public class TestCustomer {

	public void test()
	{
		Customer togy=new Customer();
		togy.setId(1);
		togy.setEmail("togy.thomas@emtalent.com");
		
		System.out.print(togy.getEmail());
	}
}
