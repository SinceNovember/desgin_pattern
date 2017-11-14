package com.liu.Singleton;

public class synchronSingleton {
	/* 
	 * ���ַ�ʽ���Ƿ��̰߳�ȫ�ˣ�����ʽ������ 
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
	 //����̰߳�ȫ����ķ����кܶ࣬�������ǿ�����getInstance()����ǰ�����synchronized�ؼ�������������£�
	public static synchronized synchronSingleton getInstance() {    
        if (instance == null) {    
            instance = new synchronSingleton();    
        }    
        return instance;    
} 
	//����synchronized�ؼ�����ס������������������÷��������ϻ������½�����Ϊÿ�ε���getInstance()ʱ��Ҫ�Զ�������
	//����ʵ�ϣ�ֻҪ�ڵ�һ�δ��������ʱ����������洴�����˾Ͳ���Ҫ�ˣ��������ǿ�������һ���ĸĽ������£�
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
	//������֡�����ʽ���������߳����⣬һ�ֽ���ʹ������ĳ����嵥1�ķ�ʽ����ʹ�á�����ʽ����������һ�֣���ʵ����
	//��Ҳ�������ڲ�����ά��������ʵ�֡�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ�������ļ��ع������̻߳���ġ�
	//�����������ǵ�һ�ε���getInstance()������ʱ��
	//��JVM�ܹ������Ǳ�֤instanceʵ��ֻ������һ�Σ����һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ����ϣ������´��룺
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
