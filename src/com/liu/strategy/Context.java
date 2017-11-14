package com.liu.strategy;

 /** 
 * @ClassName: Context 
 * @author: lyd
 * @date: 2017��11��14�� ����11:14:29 
 * @describe:�¿ͻ�С�������� 
�¿ͻ����������� 
�Ͽͻ�С�������� 
�Ͽͻ�����������
�����и����ԵĽӿڣ�Ȼ��ͬ���ĸ���ͬ�Ĳ��Էֱ�ʵ������ӿ��еķ���
���������Ǳ��۵ķ�����Ȼ����һ���������࣬������������ľ���Ĳ��ԣ�
�ͻ���ֻ��Ҫ����������Ĵ򽻵����ɣ���ֻҪ�����Դ����������࣬�Ϳ���ִ����Ӧ�Ĳ��ԣ�
���������Ҫ�޸Ļ�����ӣ�ֻ��Ҫ�޸ľ���Ĳ���ʵ������������һ��ʵ���༴�ɣ�����ά�������������³����ʵ��
 */
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy=strategy;
	}
	public void getPrice(double standardPrice){
		  System.out.println("����Ϊ��" + strategy.getprice(standardPrice));
	}
}
