package com.liu.strategy;

 /** 
 * @ClassName: Context 
 * @author: lyd
 * @date: 2017年11月14日 下午11:14:29 
 * @describe:新客户小批量报价 
新客户大批量报价 
老客户小批量报价 
老客户大批量报价
首先有个策略的接口，然后不同的四个不同的策略分别实现这个接口中的方法
，在这里是报价的方法，然后定义一个上下文类，用来操作具体的具体的策略，
客户端只需要与这个上下文打交道即可，即只要将策略传给上下文类，就可以执行相应的策略，
后期如果需要修改或者添加，只需要修改具体的策略实现类或者新添加一个实现类即可，便于维护。下面来看下程序的实现
 */
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy=strategy;
	}
	public void getPrice(double standardPrice){
		  System.out.println("报价为：" + strategy.getprice(standardPrice));
	}
}
