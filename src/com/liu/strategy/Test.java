package com.liu.strategy;

public class Test {
public static void main(String[] args) {
    Strategy s1 = new OldCustomerManyStrateg();
    Context ctx = new Context(s1); //通过构造方法注入策略

    ctx.getPrice(1000);
}
}
