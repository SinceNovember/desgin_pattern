package com.liu.proxy;

 /** 
 * @ClassName: RealStar 
 * @author: lyd
 * @date: 2017��11��14�� ����10:45:29 
 * @describe:��ʵ��
 */
public class RealStar implements Star{

	  public void confer() {
	        System.out.println("RealStar.confer()");
	    }

	    @Override
	    public void sing() {
	        System.out.println("RealStar(�ܽ���).sing()");
	    }

	    @Override
	    public void collectMoney() {
	        System.out.println("RealStar.collectMoney()");
	    }

}
