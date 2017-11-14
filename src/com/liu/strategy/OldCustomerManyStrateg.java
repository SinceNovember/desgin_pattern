package com.liu.strategy;

public class OldCustomerManyStrateg implements Strategy{
	 @Override
	    public double getprice(double standardPrice) {

	        System.out.println("老客户大批量，打八折");
	        return standardPrice * 0.7;
	    }
}

