package testdemo;                                                                          
                                                                                           
public class StringDemo1 {                                                                                                                                               
	public static void main(String[] args) {                                               
		String str = "hello";                                                              
		char date [] = str.toCharArray();       //�ַ���ת����                                   
		for(int i=0;i<date.length;i++) {                                                   
			date[i] -=32;                                                                  	                                                                               
		}                                                                                  
              System.out.println(new String(date));//��ȫ���ַ������ΪSring                        
              System.out.println(new String(date,1,2));//�������ַ������ΪString                   
	}                                                                                      
                                                                                           
}                                                                                          
                                                                                           