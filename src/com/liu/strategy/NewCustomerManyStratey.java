package com.liu.strategy;

public class NewCustomerManyStratey implements Strategy{

	 public double getprice(double standardPrice) {

	        System.out.println("�¿ͻ��������������");
	        return standardPrice * 0.9;
	    }
	

}
