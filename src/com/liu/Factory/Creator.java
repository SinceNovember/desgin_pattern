package com.liu.Factory;

 /** 
 * @ClassName: Creator 
 * @author: lyd
 * @date: 2017年11月13日 下午10:27:21 
 * @describe:抽象工厂类负责定义产品对象的产生，代码如下：
 */
public abstract class Creator {
	  //创建一个产品对象，其输入参数类型可以自行设置  
	public abstract <T extends Product> T createProduct(Class<T> clazz);
	
}
