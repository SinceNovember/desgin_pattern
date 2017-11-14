package com.liu.Factory;

 /** 
 * @ClassName: Product 
 * @author: lyd
 * @date: 2017年11月13日 下午8:55:55 
 * @describe:Product抽象类负责定义产品的共性，实现对事物最抽象的定义，Creator为抽象工厂类
 * ，具体如何创建产品类由具体的实现工厂ConcreteCreator来完成。我们来看一下通用的模板代码：
 */
public abstract class Product {
		public void method(){//产品类的公共方法，已经实现  
			//实现了公共的逻辑 
		}
		public abstract void method2(); //非公共方法，需要子类具体实现  
}
