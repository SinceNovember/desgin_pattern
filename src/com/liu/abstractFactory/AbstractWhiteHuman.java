package com.liu.abstractFactory;

public abstract class AbstractWhiteHuman implements Human{
	  @Override  
	    public void getColor() {  
	        System.out.println("White color");  
	    }  
	    @Override  
	    public void talk() {  
	        System.out.println("White people");  
	    }   
}
