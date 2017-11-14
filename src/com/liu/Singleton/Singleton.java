package com.liu.Singleton;

 /** 
 * @ClassName: Singleton 
 * @author: lyd
 * @date: 2017年11月13日 下午4:02:06 
 * @describe:单例模式（Singleton Pattern）是一个比较简单的模式，
 * 其原始定义如下：Ensure a class has only one instance, and provide a global point of access to it.
 *  即确保只有一个实例，而且自行实例化并向整个系统提供这个实例。单例模式的通用类如下图所示：
   Singleton类称为单例类，通过使用private的构造函数确保了在一个应用中只产生一个实例，并且是自行实例化的（在Singleton中自己new Singleton()）。单例模式的通用代码如下（这种也称为饿汉式单例）：
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
