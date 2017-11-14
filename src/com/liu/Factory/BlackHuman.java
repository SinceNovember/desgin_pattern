package com.liu.Factory;

public class BlackHuman implements Human{

	public void getColor() {
		System.out.println("Black");
		
	}

	public void talk() {
		System.out.println("Black man");
		
	}
	
}
 class yellwHuman implements Human{

	 public void getColor() {  
	        System.out.println("Yellow");  
	    }  
	    @Override  
	    public void talk() {  
	        System.out.println("Yellow man");  
	    }  
	
}
 class WhiteHuman implements Human {//∞◊÷÷»À  
	  
	    @Override  
	    public void getColor() {  
	        System.out.println("White");  
	    }  
	    @Override  
	    public void talk() {  
	        System.out.println("White man");  
	    }  
	}  