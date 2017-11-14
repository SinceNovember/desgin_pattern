package com.liu.Singleton;

import java.util.ArrayList;
import java.util.Random;

public class SingletionTest {
	 //定义最多能产生的实例数量  
    private static int maxNumOfInstance = 3;  
    //存储每个实例的名字  
    private static ArrayList<String> nameList = new ArrayList<String>(); 
    //存储每个实例对象  
    private static ArrayList<SingletionTest> instanceList = new ArrayList<SingletionTest>();  
    //当前实例的索引  
    private static int indexOfInstance = 0;  
  //静态代码块，在类加载的时候初始化2个实例  
    static {  
        for(int i = 0; i < maxNumOfInstance; i++) {  
            instanceList.add(new SingletionTest("instance"+(i+1)));  
        } 
    }
    private SingletionTest()
    {
    	
    }
    private SingletionTest(String name){
    	nameList.add(name);
    }
    public static SingletionTest getInstance() {  
        Random random = new Random();  
        //随机挑选一个实例  
        indexOfInstance = random.nextInt(maxNumOfInstance);  
        return instanceList.get(indexOfInstance);  
    }  
    public void test() {  
        System.out.println(nameList.get(indexOfInstance));  
    }  @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
    public static void main(String[] args) {
    	int num = 5;  
        for(int i = 0; i < num; i++) {  
        	SingletionTest instance = SingletionTest.getInstance();  
            instance.test();  
        }  
	}
}
