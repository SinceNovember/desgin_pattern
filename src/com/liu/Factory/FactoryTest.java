package com.liu.Factory;

 /** 
 * @ClassName: FactoryTest 
 * @author: lyd
 * @date: 2017��11��14�� ����12:35:22 
 * @describe:��Ҫ����˼�ǣ�ͨ������һ��������Ȼ������ͬ����������ͬ�Ľӿڵ�����д���һ��ʵ����
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
