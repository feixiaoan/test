package testdemo;                                                                          
                                                                                           
public class StringDemo1 {                                                                                                                                               
	public static void main(String[] args) {                                               
		String str = "hello";                                                              
		char date [] = str.toCharArray();       //字符串转数组                                   
		for(int i=0;i<date.length;i++) {                                                   
			date[i] -=32;                                                                  	                                                                               
		}                                                                                  
              System.out.println(new String(date));//将全部字符数组变为Sring                        
              System.out.println(new String(date,1,2));//将部分字符数组变为String                   
	}                                                                                      
                                                                                           
}                                                                                          
                                                                                           