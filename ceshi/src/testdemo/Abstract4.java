package testdemo;
abstract class Action {
	public static final int EAT = 1;
	public static final int SLEEP = 5;
	public static final int WORK = 7;
	public void command(int flag) {
		switch(flag) {
		case EAT :
			this.eat();  
			break;
		case SLEEP :
			this.sleep();
			break;
		case WORK :
			this.work();
			break;
		case EAT + WORK :
			this.eat();
			this.work();
			break;
		}
	}
	//因为不确定子类的实现
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
}
class Robot extends Action {
	public void eat() {
		System.out.println("机器人补充能量！");
	}
	public void sleep() {}
    public void work() {
		System.out.println("机器人正在努力工作!");
	}
}
class Human extends Action {
	public void eat() {
		System.out.println("人正在吃饭！");
	}
	public void sleep() {
		System.out.println("人类正在睡觉休息！");
	}
    public void work() {
		System.out.println("人类正在为了梦想努力工作!");
	}
}
class Pig extends Action {
	public void eat() {
		System.out.println("猪正在啃食槽！");
	}
	public void sleep() {
		System.out.println("猪正在睡觉养膘！");
	}
    public void work() {}
}
public class Abstract4 {

	public static void main(String[] args) {
		fun(new Robot());
		fun(new Human());
		fun(new Pig());
	}
	public static void fun(Action act) {
		act.command(Action.EAT);
		act.command(Action.SLEEP);
		act.command(Action.WORK);
	}

}
