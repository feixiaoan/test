package test;
import com.mythread.www.MyThread;;
public class run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		/*
		 多次调用start（）方法，则会出现异常
		 Exception in thread "main" java.lang.IllegalThreadStateException
		 */
//		mythread.start();
//		mythread.start();
		System.out.println("运行结束！");
	}

}
