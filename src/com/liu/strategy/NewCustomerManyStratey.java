package com.liu.strategy;

public class NewCustomerManyStratey implements Strategy{

	 public double getprice(double standardPrice) {

	        System.out.println("新客户大批量，打九折");
	        return standardPrice * 0.9;
	    }
	

}
