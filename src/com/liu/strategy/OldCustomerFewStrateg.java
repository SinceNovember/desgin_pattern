package com.liu.strategy;

public class OldCustomerFewStrateg implements Strategy{
	public double getprice(double standardPrice) {

        System.out.println("�Ͽͻ�С�����������");
        return standardPrice * 0.8;
    }
}

