package com.liu.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Star real=new RealStar();
		Star proxy=new ProxyStar(real);
		proxy.confer();
		proxy.collectMoney();
		proxy.sing();
	}
}
