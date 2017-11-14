package com.liu.template;

public abstract class HUmmerModel {
    protected abstract void start(); //·¢¶¯  
    protected abstract void stop();  //Í£Ö¹  
    protected abstract void alarm(); //ÃùµÑ  
    protected abstract void engineBoom(); //ºäÃù
    final public void run(){
    	this.start();
    	this.engineBoom();
    	if(this.isAlarm()){
    		this.alarm();
    	}
    	this.stop();
    }
	protected boolean isAlarm() {
		// TODO Auto-generated method stub
		return true;
	}
}
