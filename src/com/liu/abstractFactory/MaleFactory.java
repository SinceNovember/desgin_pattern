package com.liu.abstractFactory;

public class MaleFactory implements HumanFactory{

	  public Human createYellowHuman() {  
	        return new MaleYellowHuman();  
	    }  
	    @Override  
	    public Human createBlackHuman() {  
	        return new MaleBlackHuman();  
	    }  
	    @Override  
	    public Human createWhiteHuman() {  
	        return new MaleWhiteHuman();  
	    }  
}
