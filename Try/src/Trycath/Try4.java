package Trycath;
class AddException extends Exception {
	public AddException(String msg) {
		super(msg);
		
	}
}
public class Try4 {

	public static void main(String[] args) {
		int i = 20;
		if(i > 10) {
			try {
				throw new AddException("��ֵ����10");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
