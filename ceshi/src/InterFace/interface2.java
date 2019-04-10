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
		System.out.println("U盘开始使用");
	}
	@Override
	public void stop() {
		System.out.println("U盘停止使用");
	}
}
class Print implements USB {
	@Override
	public void start() {
		System.out.println("打印机开始使用");
	}
	@Override
	public void stop() {
		System.out.println("打印机停止使用");
	}
}
public class interface2 {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.plugin(new Flash());

	}

}
