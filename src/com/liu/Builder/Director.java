package com.liu.Builder;

import java.util.ArrayList;

 /** 
 * @ClassName: Director 
 * @author: lyd
 * @date: 2017年11月14日 下午10:06:52 
 * @describe:只是在原来的基础上增加了一个Director类充当着设计师的角色，负责按照指定的顺序生产模型
 * ，比如我们要一个A顺序的奔驰车，B顺序的奔驰车，A顺序的宝马车，B顺序的宝马车……等等
 */
public class Director {
	 private ArrayList<String> sequence = new ArrayList<String>();  
	    private BenzBuilder benzBuilder = new BenzBuilder();  
	      
	    //A顺序的奔驰车  
	    public BenzModel getABenzModel() {  
	        this.sequence.clear();  
	        this.sequence.add("start");  
	        this.sequence.add("stop");  
	        //返回A顺序的奔驰车  
	        this.benzBuilder.setSequence(sequence);  
	        return (BenzModel) this.benzBuilder.getCarModel();  
	    }  
	      
	    //B顺序的奔驰车  
	    public BenzModel getBBenzModel() {  
	        this.sequence.clear();  
	        this.sequence.add("engine boom");  
	        this.sequence.add("start");  
	        this.sequence.add("stop");  
	        //返回B顺序的奔驰车  
	        this.benzBuilder.setSequence(sequence);  
	        return (BenzModel) this.benzBuilder.getCarModel();  
	    }  
	      
}
