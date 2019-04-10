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
	//��Ϊ��ȷ�������ʵ��
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
}
class Robot extends Action {
	public void eat() {
		System.out.println("�����˲���������");
	}
	public void sleep() {}
    public void work() {
		System.out.println("����������Ŭ������!");
	}
}
class Human extends Action {
	public void eat() {
		System.out.println("�����ڳԷ���");
	}
	public void sleep() {
		System.out.println("��������˯����Ϣ��");
	}
    public void work() {
		System.out.println("��������Ϊ������Ŭ������!");
	}
}
class Pig extends Action {
	public void eat() {
		System.out.println("�����ڿ�ʳ�ۣ�");
	}
	public void sleep() {
		System.out.println("������˯�����죡");
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
