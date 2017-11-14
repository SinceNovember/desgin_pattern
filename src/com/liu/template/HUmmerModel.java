package com.liu.template;

public abstract class HUmmerModel {
    protected abstract void start(); //����  
    protected abstract void stop();  //ֹͣ  
    protected abstract void alarm(); //����  
    protected abstract void engineBoom(); //����
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
