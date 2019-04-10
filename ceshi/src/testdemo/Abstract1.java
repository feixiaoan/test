package testdemo;
abstract class AB {
	public void fun() {
		System.out.println("普通方法");
	}
	public abstract void print();
} 
class AC extends AB{
	public void print() {
		System.out.println("ABBBBBBB");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		AB a = new AC();   //向上转型
		a.print();    //被子类所复写的方法

	}

}
