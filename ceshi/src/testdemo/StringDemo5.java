package testdemo;

public class StringDemo5 {

	public static void main(String[] args) {
	String stra = "##@@helloworld##";
	System.out.println(stra.startsWith("##"));    //�ж��Ƿ���˭��ʼ
	System.out.println(stra.startsWith("@@",2));  //
	System.out.println(stra.endsWith("##"));      //�ж��Ƿ���˭��β
     
	
	//�ж��Ƿ��ҵ���Ӧ�ַ���
/*
	if(stra.contains("hello")) {          //contains��������booleanֵ
		System.out.println("��ѯ�����");
	}
	else {
		System.out.println("û�в�ѯ�����");
	}
*/
	
	
	
	//�жϲ�ѯ��ĸ��λ��
/*
	System.out.println(stra.indexOf("world"));    //���������һ����ĸλ�õ�����
	System.out.println(stra.indexOf("l"));        //���ص�һ�����������
	System.out.println(stra.indexOf("l",5));      //���ص�5��֮�����������
	System.out.println(stra.lastIndexOf("l"));    //�������һ����ĸλ�õ����� 
*/	
	}

}
