package com.liu.Builder;

import java.util.ArrayList;

public class BuilderTest {
	public static void main(String[] args) {
		ArrayList<String> sequence=new ArrayList<String>();
		   sequence.add("engine boom");  
	        sequence.add("start");  
	        sequence.add("stop");  
	        //要用这个顺序造一辆奔驰 
	        BenzBuilder benzBuilder=new BenzBuilder();
	        benzBuilder.setSequence(sequence);
	        CarModel benzBuilder2=benzBuilder.getCarModel();
	        benzBuilder2.run();
	}
}
