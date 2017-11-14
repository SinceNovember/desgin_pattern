package com.liu.abstractFactory;

public abstract class AbstractBlackHuman implements Human{
	  @Override  
	    public void getColor() {  
	        System.out.println("Black color");  
	    }  
	    @Override  
	    public void talk() {  
	        System.out.println("Black people");  
	    }   
}
