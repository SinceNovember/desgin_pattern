package com.liu.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		 System.out.println("----H1�ͺ���----");  
	        System.out.println("�Ƿ���Ҫ�������죿 0-����Ҫ  1-��Ҫ");  
	        String type=new BufferedReader(new InputStreamReader(System.in)).readLine();
	        HummerH1 h1=new HummerH1();
	        if(type.equals("0")){
	        	h1.setAlarm(false);
	        }
	        h1.run();
	}
}
