package an.xiao.fei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import an.xiao.fei.Apple;
import an.xiao.fei.IFruit;
public class TestFruit {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IFruit fruit = ctx.getBean("apple",Apple.class);
		fruit.eat();
	}

}
