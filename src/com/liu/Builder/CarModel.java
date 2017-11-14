package com.liu.Builder;

import java.lang.reflect.Array;
import java.util.ArrayList;

 /** 
 * @ClassName: CarModel 
 * @author: lyd
 * @date: 2017年11月14日 下午9:01:34 
 * @describe: 假如现在要生产两种车，奔驰和宝马，这两辆车都有共性，
 * 我们所需要关注的是单个车的运行过程，这才是老板所关心的点所在。我们先这样想
 * ，针对这个需求，我们要找到一个切入点，那就是产品类，
 * 每个车都是一个产品，那么在产品类中我们可以控制车的运行顺序，
 * 这样每个车都可以拥有自己想要的顺序了。基于此，
 */
public abstract class CarModel {
	private ArrayList<String> sequenc=new ArrayList<String>();
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	final public void run(){
		for(int i=0;i<this.sequenc.size();i++){
			String actionName=this.sequenc.get(i);
			 if(actionName.equalsIgnoreCase("start")) {  
	                this.start(); //启动汽车  
	            } else if(actionName.equalsIgnoreCase("stop")) {  
	                this.stop(); //停止汽车  
	            } else if(actionName.equalsIgnoreCase("alarm")) {  
	                this.alarm(); //汽车鸣笛  
	            } else if(actionName.equalsIgnoreCase("engine boom")) {  
	                this.engineBoom(); //汽车轰鸣  
	            }  
		}
	}
	final public void setSequenc(ArrayList<String> sequence){
		this.sequenc=sequence;
		
	}
}
