package com.liu.Singleton;

 /** 
 * @ClassName: Singleton 
 * @author: lyd
 * @date: 2017��11��13�� ����4:02:06 
 * @describe:����ģʽ��Singleton Pattern����һ���Ƚϼ򵥵�ģʽ��
 * ��ԭʼ�������£�Ensure a class has only one instance, and provide a global point of access to it.
 *  ��ȷ��ֻ��һ��ʵ������������ʵ������������ϵͳ�ṩ���ʵ��������ģʽ��ͨ��������ͼ��ʾ��
   Singleton���Ϊ�����࣬ͨ��ʹ��private�Ĺ��캯��ȷ������һ��Ӧ����ֻ����һ��ʵ��������������ʵ�����ģ���Singleton���Լ�new Singleton()��������ģʽ��ͨ�ô������£�����Ҳ��Ϊ����ʽ��������
 */
public class Singleton {
	private static Singleton instance=new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getInstance(){
		return instance;
	}
	public void test(){
		System.out.println("Singleton");
	}
	public static void main(String[] args) {
		Singleton.getInstance().test();
	}
}
