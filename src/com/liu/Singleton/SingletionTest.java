package com.liu.Singleton;

import java.util.ArrayList;
import java.util.Random;

public class SingletionTest {
	 //��������ܲ�����ʵ������  
    private static int maxNumOfInstance = 3;  
    //�洢ÿ��ʵ��������  
    private static ArrayList<String> nameList = new ArrayList<String>(); 
    //�洢ÿ��ʵ������  
    private static ArrayList<SingletionTest> instanceList = new ArrayList<SingletionTest>();  
    //��ǰʵ��������  
    private static int indexOfInstance = 0;  
  //��̬����飬������ص�ʱ���ʼ��2��ʵ��  
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
        //�����ѡһ��ʵ��  
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
