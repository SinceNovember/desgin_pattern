package com.liu.Factory;

public class HumanFactoryTest {
public static void main(String[] args) {
	HumanFactory humanFactory=new HumanFactory();//���԰�ȥ������HumanFactory�ĳɾ�ֱ̬�ӽ��е��á�
	Human blackMan=humanFactory.createHuman(BlackHuman.class);
	Human yellowMan=humanFactory.createHuman(yellwHuman.class);
	Human whiteMAN=humanFactory.createHuman(WhiteHuman.class);
	blackMan.getColor();
	blackMan.talk();
}
}
