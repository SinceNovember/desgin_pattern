package com.liu.template;

 /** 
 * @ClassName: HummerH1 
 * @author: lyd
 * @date: 2017��11��14�� ����5:44:24 
 * @describe:  ���ʵ�ֺܺã�������ʵ�����ж���һ���жϱ�ǣ�
 * Ȼ������ṩһ��public�ӿ�setAlarm���������������жϱ�ǣ�
 * ������ǿ���һ����������ture��false���С����isAlarm�����׳ƹ��ӷ��������˹��ӷ�����ģ�巽��ģʽ��������
 * ����ҿ�������һ�£��������һ����������ֵ�����������ֵ�ִ�н����
 * ����Ǻ����������ġ�����������һ��
 */
public class HummerH1 extends HUmmerModel{

	 private boolean alarmFlag = true; //�жϱ��  
	    @Override  
	    public void start() {  
	        System.out.println("H1��������");  
	    }  
	  
	    @Override  
	    public void stop() {  
	        System.out.println("H1ֹͣ����");  
	    }  
	  
	    @Override  
	    public void alarm() {  
	        System.out.println("H1���ѡ���");  
	    }  
	  
	    @Override  
	    public void engineBoom() {  
	        System.out.println("H1��������");  
	    }  
	      
	    @Override  
	    protected boolean isAlarm() { //��дisAlarm�����������жϱ��  
	        return this.alarmFlag;  
	    }  
	      
	    public void setAlarm(boolean isAlarm) { //�����жϱ��  
	        this.alarmFlag = isAlarm;  
	    }  
}
