package com.liu.strategy;

public class OldCustomerManyStrateg implements Strategy{
	 @Override
	    public double getprice(double standardPrice) {

	        System.out.println("�Ͽͻ��������������");
	        return standardPrice * 0.7;
	    }
}

