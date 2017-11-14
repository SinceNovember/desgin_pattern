package com.liu.abstractFactory;

 /** 
 * @ClassName: getpeopleTest 
 * @author: lyd
 * @date: 2017年11月14日 下午5:24:41 
 * @describe:上一节学习了工厂模式，女娲运用了该模式成功创建了三个人种，可是问题来了
 * ，她发现没有性别……这失误也忒大了点吧……竟然没有性别，那岂不是……无奈，
 * 只好抹掉重来了，于是所有人都被消灭掉了，重新造人。
        女娲开始分析了，既然要区别男女，那么生产人种的工厂（八卦炉）要重新改造了，
        因为一个设备要么全男性，要么全女性。所以只能将八卦炉拆开了，把原先的一个变两个
        ，并且略加修改，变成女性八卦炉和男性八卦炉，这样就可以了
 */
public class getpeopleTest {
	public static void main(String[] args) {
		HumanFactory maleHumanFactory = new MaleFactory(); //第一条生产线：男性生产线  
        HumanFactory femaleHumanFactory = new FemaleFactory(); //第二条生产线：女性生产线 
        Human maleYellowHuman=maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman=femaleHumanFactory.createYellowHuman();
        
        System.out.println("--生产一个黄色女性--");  
        femaleYellowHuman.getColor();  
        femaleYellowHuman.talk();  
        femaleYellowHuman.getSex();  
          
        System.out.println("--生产一个黄色男性--");  
        maleYellowHuman.getColor();  
        maleYellowHuman.talk();  
        maleYellowHuman.getSex();  
	}
}
