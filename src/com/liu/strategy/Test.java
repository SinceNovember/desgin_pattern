package com.liu.strategy;

public class Test {
public static void main(String[] args) {
    Strategy s1 = new OldCustomerManyStrateg();
    Context ctx = new Context(s1); //ͨ�����췽��ע�����

    ctx.getPrice(1000);
}
}
