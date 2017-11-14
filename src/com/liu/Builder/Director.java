package com.liu.Builder;

import java.util.ArrayList;

 /** 
 * @ClassName: Director 
 * @author: lyd
 * @date: 2017��11��14�� ����10:06:52 
 * @describe:ֻ����ԭ���Ļ�����������һ��Director��䵱�����ʦ�Ľ�ɫ��������ָ����˳������ģ��
 * ����������Ҫһ��A˳��ı��۳���B˳��ı��۳���A˳��ı�����B˳��ı��������ȵ�
 */
public class Director {
	 private ArrayList<String> sequence = new ArrayList<String>();  
	    private BenzBuilder benzBuilder = new BenzBuilder();  
	      
	    //A˳��ı��۳�  
	    public BenzModel getABenzModel() {  
	        this.sequence.clear();  
	        this.sequence.add("start");  
	        this.sequence.add("stop");  
	        //����A˳��ı��۳�  
	        this.benzBuilder.setSequence(sequence);  
	        return (BenzModel) this.benzBuilder.getCarModel();  
	    }  
	      
	    //B˳��ı��۳�  
	    public BenzModel getBBenzModel() {  
	        this.sequence.clear();  
	        this.sequence.add("engine boom");  
	        this.sequence.add("start");  
	        this.sequence.add("stop");  
	        //����B˳��ı��۳�  
	        this.benzBuilder.setSequence(sequence);  
	        return (BenzModel) this.benzBuilder.getCarModel();  
	    }  
	      
}
