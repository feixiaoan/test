package InterFace;
interface USB {
	public void start();
	public void stop();
}
class Computer {
	public void plugin(USB usb) {
		usb.start();
		usb.stop();
	}
}
class Flash implements USB {
	@Override
	public void start() {
		System.out.println("U�̿�ʼʹ��");
	}
	@Override
	public void stop() {
		System.out.println("U��ֹͣʹ��");
	}
}
class Print implements USB {
	@Override
	public void start() {
		System.out.println("��ӡ����ʼʹ��");
	}
	@Override
	public void stop() {
		System.out.println("��ӡ��ֹͣʹ��");
	}
}
public class interface2 {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.plugin(new Flash());

	}

}
