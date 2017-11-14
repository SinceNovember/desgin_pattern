package com.liu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
 * @ClassName: dynamicsproxy 
 * @author: lyd
 * @date: 2017年11月14日 下午10:54:10 
 * @describe:　动态代理比静态代理使用的更广泛，动态代理在本质上，
 * 代理类不用我们来管，我们完全交给工具去生成代理类。Star接口和RealStar实现类还是和上面的一样，
 * 下面来定义一下代理类，使用动态代理需要实现InvocationHandler接口，并覆写里面的invoke方法，
 */
public class dynamicsproxy implements InvocationHandler{
	Star realStar;
	public  dynamicsproxy(Star realStar) {
		this.realStar=realStar;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object=null;
		System.out.println("面谈");
		if(method.getName().equals("sing")){
			object=method.invoke(realStar, args);
		}
		System.out.println("收钱");
		return object;
	}
}
