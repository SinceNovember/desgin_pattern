package com.liu.Builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{
	private BenzModel benz=new BenzModel();//���۳�ģ��  
	@Override
	public void setSequence(ArrayList<String> sequence) {
		
		benz.setSequenc(sequence);//���ñ��۳�ģ�͵�����˳�� 
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;//�����ģ�ͷ��� 
	}
	

}
