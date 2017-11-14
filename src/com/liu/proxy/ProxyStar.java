package com.liu.proxy;

 /** 
 * @ClassName: ProxyStar 
 * @author: lyd
 * @date: 2017年11月14日 下午10:47:26 
 * @describe:代理类
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) { //到时候传进来真实的star
        super();
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void sing() {
        //其他事都能干，唯一不能干的就是唱歌，唱歌还是得要周杰伦本人来唱
        star.sing(); //让他本人来唱
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

}