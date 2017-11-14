package com.liu.abstractFactory;

 /** 
 * @ClassName: getpeopleTest 
 * @author: lyd
 * @date: 2017��11��14�� ����5:24:41 
 * @describe:��һ��ѧϰ�˹���ģʽ��Ů������˸�ģʽ�ɹ��������������֣�������������
 * ��������û���Ա𡭡���ʧ��Ҳ߯���˵�ɡ�����Ȼû���Ա������ǡ������Σ�
 * ֻ��Ĩ�������ˣ����������˶���������ˣ��������ˡ�
        Ů洿�ʼ�����ˣ���ȻҪ������Ů����ô�������ֵĹ���������¯��Ҫ���¸����ˣ�
        ��Ϊһ���豸Ҫôȫ���ԣ�ҪôȫŮ�ԡ�����ֻ�ܽ�����¯���ˣ���ԭ�ȵ�һ��������
        �������Լ��޸ģ����Ů�԰���¯�����԰���¯�������Ϳ�����
 */
public class getpeopleTest {
	public static void main(String[] args) {
		HumanFactory maleHumanFactory = new MaleFactory(); //��һ�������ߣ�����������  
        HumanFactory femaleHumanFactory = new FemaleFactory(); //�ڶ��������ߣ�Ů�������� 
        Human maleYellowHuman=maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman=femaleHumanFactory.createYellowHuman();
        
        System.out.println("--����һ����ɫŮ��--");  
        femaleYellowHuman.getColor();  
        femaleYellowHuman.talk();  
        femaleYellowHuman.getSex();  
          
        System.out.println("--����һ����ɫ����--");  
        maleYellowHuman.getColor();  
        maleYellowHuman.talk();  
        maleYellowHuman.getSex();  
	}
}
