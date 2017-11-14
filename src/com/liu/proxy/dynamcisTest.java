package com.liu.proxy;

import java.lang.reflect.Proxy;

public class dynamcisTest {
	public static void main(String[] args) {
		Star realStar=new RealStar();
		dynamicsproxy handler=new dynamicsproxy(realStar);
		Star proxy=(Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		proxy.sing();
	}
	
	
}
