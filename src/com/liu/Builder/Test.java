package com.liu.Builder;

public class Test {
	public static void main(String[] args) {
		Director director=new Director();
		for(int i=0;i<10000;i++){
			director.getABenzModel().run();
			
		}
		for(int i=0;i<100000;i++){
			director.getBBenzModel();
		}
	}
}
