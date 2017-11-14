package com.liu.Builder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		BenzModel benzModel=new BenzModel();
		ArrayList<String> sequence=new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		 sequence.add("stop");  
	        //我们把这个顺序赋予奔驰  
	        benzModel.setSequenc(sequence);  
	        benzModel.run(); 
	}
}
