package com.liu.strategy;

public class OldCustomerFewStrateg implements Strategy{
	public double getprice(double standardPrice) {

        System.out.println("老客户小批量，打八折");
        return standardPrice * 0.8;
    }
}

