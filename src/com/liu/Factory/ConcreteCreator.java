package com.liu.Factory;

 /** 
 * @ClassName: ConcreteCreator 
 * @author: lyd
 * @date: 2017年11月13日 下午10:27:43 
 * @describe:  这里用的是泛型，传入的对象必须是Product抽象类的实现类。
 * 具体如何产生一个产品的对象，是由具体工厂类实现的，具体工厂类继承这个抽象工厂类：
 */
public class ConcreteCreator extends Creator{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> clazz) {
		Product product=null;
		try{
			product=(Product) Class.forName(clazz.getName()).newInstance();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return (T)product;
	}
	

}
