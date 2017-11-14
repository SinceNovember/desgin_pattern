package com.liu.Factory;

import java.lang.reflect.Constructor;

public class FactorytoSingletonTest {
	private static FactorytoSingleton factorytoSingletoninstance;
	static{
		try{
			Class clazz=Class.forName(FactorytoSingleton.class.getName());
			Constructor constructor=clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			factorytoSingletoninstance=(FactorytoSingleton) constructor.newInstance();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static FactorytoSingleton getInstance(){
		return factorytoSingletoninstance;
	}
}
