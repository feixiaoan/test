package testdemo;

public class StringDemo6 {

	public static void main(String[] args) {
		//�ַ������
		//�ж��Ƿ�Ϊ���ַ���
		String str = "hello";
		
		System.out.println(str.isEmpty());  //�ж��Ƿ�Ϊ��
		System.out.println("".isEmpty());   //""
		System.out.println(str.length());   //��ȡ�ַ�������
		
/*	
		//�����ַ�����β�ո�
		String str = "   hello     ";
		System.out.println("��" + str + "��");
	    System.out.println("��" + str.trim() + "��");  //ȥ����ĸ���˵Ŀո�
		
*/
		
/*		
		//��Сд�ַ���ת��
		String str = "helLo world";
	    System.out.println(str.toUpperCase());   //��ĸת��д
	    System.out.println(str.toLowerCase());   //��ĸתСд
		
*/
		
/*
		//�����ļ�
		String stra = "������22|���ģ�23| ���壺24";
		String result [] = stra.split("\\|");
		for(int i=0 ;i<result.length ;i++) {
			String temp [] = result[i].split("��");
			System.out.println("���� ��" + temp[0] + "���䣺" +temp[1]);
		}
*/	
		
		
		
		
/*		
		//�����ַ��������ǣ��޷����Ҫ��ת���ַ� \\
		String stra = "192.168.1.2";
		String resultc [] = stra.split("\\.");   //������ʽ������  .  Ҫ��ת���ַ�  \\  
		for(int i=0; i<resultc.length; i++) {
			System.out.println(resultc[i]);
		}
		
		String str = "hello world nihao mldn";
		String resultA [] = str.split(" ",2);  //���տո���
		String resultB [] = str.split("");   //����ÿ���ֲ��
		
		for(int i=0; i<resultA.length; i++) {
			System.out.println(resultA[i]);
		}
		for(int i=0; i<resultB.length; i++) {
			System.out.println(resultB[i]);
		}
*/		
		
		
/*		
		//�ַ�����ȡ
		String str = "helloworld";
		String resultA = str.substring(5);    //��ָ��λ�õ���β
		String resultB = str.substring(0,5);  //��ָ��λ�õ�ָ��λ�ý���
		System.out.println(resultA);
		System.out.println(resultB); 
		
*/		
		
		//�ַ����滻
/*
        String str = "helloworld";
		String resultA = str.replaceAll("l","_");    //ȫ���滻
		String resultB = str.replaceFirst("l","_");  //�����滻
		System.out.println(resultA);
		System.out.println(resultB);
*/
	}

}
