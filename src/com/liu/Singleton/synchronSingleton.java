package com.liu.Singleton;

public class synchronSingleton {
	/* 
	 * 这种方式就是非线程安全了（懒汉式单例） 
	 */
	 private static synchronSingleton instance = null;  
//	    private synchronSingleton() {  
//	          
//	    }  
//	    public static synchronSingleton getInstance() {  
//	        if(instance == null) {  
//	            instance = new synchronSingleton();  
//	        }  
//	        return instance;  
//	    }  
	 //解决线程安全问题的方法有很多，比如我们可以在getInstance()方法前面加上synchronized关键字来解决，如下：
	public static synchronized synchronSingleton getInstance() {    
        if (instance == null) {    
            instance = new synchronSingleton();    
        }    
        return instance;    
} 
	//但是synchronized关键字锁住的是这个对象，这样的用法在性能上会有所下降，因为每次调用getInstance()时都要对对象上锁
	//。事实上，只要在第一次创建对象的时候加锁，后面创建完了就不需要了，所以我们可以做进一步的改进，如下：
	public static synchronSingleton getInstance1() {    
        if (instance == null) {    
            synchronized (instance) {    
                if (instance == null) {    
                    instance = new synchronSingleton();    
                }    
            }    
        }    
        return instance;    
	}  
	//解决这种“懒汉式”单例的线程问题，一种建议使用上面的程序清单1的方式，即使用”饿汉式“单例。另一种，在实际中
	//，也可以用内部类来维护单例的实现。JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
	//这样，当我们第一次调用getInstance()方法的时候
	//，JVM能够帮我们保证instance实例只被创建一次，并且会保证把赋值给instance的内存初始化完毕，见如下代码：
	private synchronSingleton(){
		
	}
	private static class SingletonFactory{
		private static synchronSingleton instace=new synchronSingleton();
	}
	public static synchronSingleton getInstance2(){
		return SingletonFactory.instace;
	}
	public Object readResolve(){
		return getInstance2();
	}
}
