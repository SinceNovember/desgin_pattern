package com.liu.Builder;

import java.lang.reflect.Array;
import java.util.ArrayList;

 /** 
 * @ClassName: CarModel 
 * @author: lyd
 * @date: 2017��11��14�� ����9:01:34 
 * @describe: ��������Ҫ�������ֳ������ۺͱ��������������й��ԣ�
 * ��������Ҫ��ע���ǵ����������й��̣�������ϰ������ĵĵ����ڡ�������������
 * ����������������Ҫ�ҵ�һ������㣬�Ǿ��ǲ�Ʒ�࣬
 * ÿ��������һ����Ʒ����ô�ڲ�Ʒ�������ǿ��Կ��Ƴ�������˳��
 * ����ÿ����������ӵ���Լ���Ҫ��˳���ˡ����ڴˣ�
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
	                this.start(); //��������  
	            } else if(actionName.equalsIgnoreCase("stop")) {  
	                this.stop(); //ֹͣ����  
	            } else if(actionName.equalsIgnoreCase("alarm")) {  
	                this.alarm(); //��������  
	            } else if(actionName.equalsIgnoreCase("engine boom")) {  
	                this.engineBoom(); //��������  
	            }  
		}
	}
	final public void setSequenc(ArrayList<String> sequence){
		this.sequenc=sequence;
		
	}
}
