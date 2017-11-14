package com.liu.abstractFactory;

public abstract class AbstractYellowHuman implements Human{
	  @Override  
	    public void getColor() {  
	        System.out.println("Yellow color");  
	    }  
	    @Override  
	    public void talk() {  
	        System.out.println("Yellow people");  
	    }   
}
