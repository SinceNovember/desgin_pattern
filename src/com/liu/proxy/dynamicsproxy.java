package com.liu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
 * @ClassName: dynamicsproxy 
 * @author: lyd
 * @date: 2017��11��14�� ����10:54:10 
 * @describe:����̬����Ⱦ�̬����ʹ�õĸ��㷺����̬�����ڱ����ϣ�
 * �����಻���������ܣ�������ȫ��������ȥ���ɴ����ࡣStar�ӿں�RealStarʵ���໹�Ǻ������һ����
 * ����������һ�´����࣬ʹ�ö�̬������Ҫʵ��InvocationHandler�ӿڣ�����д�����invoke������
 */
public class dynamicsproxy implements InvocationHandler{
	Star realStar;
	public  dynamicsproxy(Star realStar) {
		this.realStar=realStar;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object=null;
		System.out.println("��̸");
		if(method.getName().equals("sing")){
			object=method.invoke(realStar, args);
		}
		System.out.println("��Ǯ");
		return object;
	}
}
