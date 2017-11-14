package com.liu.proxy;

 /** 
 * @ClassName: ProxyStar 
 * @author: lyd
 * @date: 2017��11��14�� ����10:47:26 
 * @describe:������
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) { //��ʱ�򴫽�����ʵ��star
        super();
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void sing() {
        //�����¶��ܸɣ�Ψһ���ܸɵľ��ǳ��裬���軹�ǵ�Ҫ�ܽ��ױ�������
        star.sing(); //������������
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

}