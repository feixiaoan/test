package Number;
class mInt {    //һ����
	private int num;   //������װ�Ļ�����������
	//�����Ŀ����Ϊ�˽���������������ʹ��ݸ�����
	public mInt(int num) {
		this.num = num;
	}
	public int intValue() {  //����װ���������ݷ���
		return this.num;
	}
}
public class myInt {

	public static void main(String[] args) {
		mInt my = new mInt(10); //��int��װΪ��
		int temp = my.intValue();
		System.out.println(temp*2);

	}

}
