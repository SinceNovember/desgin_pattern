package com.liu.Factory;

 /** 
 * @ClassName: Creator 
 * @author: lyd
 * @date: 2017��11��13�� ����10:27:21 
 * @describe:���󹤳��ฺ�����Ʒ����Ĳ������������£�
 */
public abstract class Creator {
	  //����һ����Ʒ����������������Ϳ�����������  
	public abstract <T extends Product> T createProduct(Class<T> clazz);
	
}
