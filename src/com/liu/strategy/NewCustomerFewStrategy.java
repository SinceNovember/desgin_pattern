package com.liu.strategy;

public class NewCustomerFewStrategy implements Strategy{

	 public double getprice(double standardPrice) {

	        System.out.println("新客户小批量，不打折");
	        return standardPrice;
	    }

	

}
