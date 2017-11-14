package com.liu.template;

 /** 
 * @ClassName: HummerH1 
 * @author: lyd
 * @date: 2017年11月14日 下午5:44:24 
 * @describe:  这个实现很好，我们在实现类中定义一个判断标记，
 * 然后对外提供一个public接口setAlarm来让外界设置这个判断标记，
 * 这就像是开关一样，想让它ture和false都行。这个isAlarm方法俗称钩子方法。有了钩子方法的模板方法模式才算完美
 * ，大家可以想象一下，由子类的一个方法返回值决定公共部分的执行结果，
 * 这个是很有吸引力的。我们来测试一下
 */
public class HummerH1 extends HUmmerModel{

	 private boolean alarmFlag = true; //判断标记  
	    @Override  
	    public void start() {  
	        System.out.println("H1发动……");  
	    }  
	  
	    @Override  
	    public void stop() {  
	        System.out.println("H1停止……");  
	    }  
	  
	    @Override  
	    public void alarm() {  
	        System.out.println("H1鸣笛……");  
	    }  
	  
	    @Override  
	    public void engineBoom() {  
	        System.out.println("H1轰鸣……");  
	    }  
	      
	    @Override  
	    protected boolean isAlarm() { //覆写isAlarm方法，返回判断标记  
	        return this.alarmFlag;  
	    }  
	      
	    public void setAlarm(boolean isAlarm) { //设置判断标记  
	        this.alarmFlag = isAlarm;  
	    }  
}
