package com.liu.Factory;

public class HumanFactoryTest {
public static void main(String[] args) {
	HumanFactory humanFactory=new HumanFactory();//可以把去掉，将HumanFactory改成静态直接进行调用。
	Human blackMan=humanFactory.createHuman(BlackHuman.class);
	Human yellowMan=humanFactory.createHuman(yellwHuman.class);
	Human whiteMAN=humanFactory.createHuman(WhiteHuman.class);
	blackMan.getColor();
	blackMan.talk();
}
}
