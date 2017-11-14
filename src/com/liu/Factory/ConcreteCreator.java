package com.liu.Factory;

 /** 
 * @ClassName: ConcreteCreator 
 * @author: lyd
 * @date: 2017��11��13�� ����10:27:43 
 * @describe:  �����õ��Ƿ��ͣ�����Ķ��������Product�������ʵ���ࡣ
 * ������β���һ����Ʒ�Ķ������ɾ��幤����ʵ�ֵģ����幤����̳�������󹤳��ࣺ
 */
public class ConcreteCreator extends Creator{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> clazz) {
		Product product=null;
		try{
			product=(Product) Class.forName(clazz.getName()).newInstance();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return (T)product;
	}
	

}
