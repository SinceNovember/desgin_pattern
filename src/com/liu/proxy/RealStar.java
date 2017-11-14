package com.liu.proxy;

 /** 
 * @ClassName: RealStar 
 * @author: lyd
 * @date: 2017年11月14日 下午10:45:29 
 * @describe:真实类
 */
public class RealStar implements Star{

	  public void confer() {
	        System.out.println("RealStar.confer()");
	    }

	    @Override
	    public void sing() {
	        System.out.println("RealStar(周杰伦).sing()");
	    }

	    @Override
	    public void collectMoney() {
	        System.out.println("RealStar.collectMoney()");
	    }

}
