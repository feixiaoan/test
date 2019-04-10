package an.xiao.fei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import an.xiao.fei.Apple;
import an.xiao.fei.IFruit;
import an.xiao.fei.vo.Dept;
public class TestDept {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept vo = ctx.getBean("dept",Dept.class);
		System.out.println(vo);
	}

}
