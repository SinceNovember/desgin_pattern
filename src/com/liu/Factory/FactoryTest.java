package com.liu.Factory;

 /** 
 * @ClassName: FactoryTest 
 * @author: lyd
 * @date: 2017年11月14日 下午12:35:22 
 * @describe:主要的意思是：通过创建一个工厂，然后将有相同方法即有相同的接口的类进行创建一个实例。
 */
public class FactoryTest {
public static void main(String[] args) {
	Creator creator=new ConcreteCreator();
	Product product1=creator.createProduct(ConcreteProduct1.class);
	Product product2=creator.createProduct(ConcteteProduct2.class);
	product1.method2();
	product2.method2();
	
}
}
