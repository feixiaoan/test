package testdemo;

public class StringDemo6 {

	public static void main(String[] args) {
		//字符串拆分
		//判断是否为空字符串
		String str = "hello";
		
		System.out.println(str.isEmpty());  //判断是否为空
		System.out.println("".isEmpty());   //""
		System.out.println(str.length());   //获取字符串长度
		
/*	
		//消除字符串首尾空格
		String str = "   hello     ";
		System.out.println("【" + str + "】");
	    System.out.println("【" + str.trim() + "】");  //去掉字母两端的空格
		
*/
		
/*		
		//大小写字符串转化
		String str = "helLo world";
	    System.out.println(str.toUpperCase());   //字母转大写
	    System.out.println(str.toLowerCase());   //字母转小写
		
*/
		
/*
		//处理文件
		String stra = "张三：22|李四：23| 王五：24";
		String result [] = stra.split("\\|");
		for(int i=0 ;i<result.length ;i++) {
			String temp [] = result[i].split("：");
			System.out.println("姓名 ：" + temp[0] + "年龄：" +temp[1]);
		}
*/	
		
		
		
		
/*		
		//敏感字符（正则标记）无法拆分要用转义字符 \\
		String stra = "192.168.1.2";
		String resultc [] = stra.split("\\.");   //正则表达式，所以  .  要用转义字符  \\  
		for(int i=0; i<resultc.length; i++) {
			System.out.println(resultc[i]);
		}
		
		String str = "hello world nihao mldn";
		String resultA [] = str.split(" ",2);  //按照空格拆分
		String resultB [] = str.split("");   //按照每个字拆分
		
		for(int i=0; i<resultA.length; i++) {
			System.out.println(resultA[i]);
		}
		for(int i=0; i<resultB.length; i++) {
			System.out.println(resultB[i]);
		}
*/		
		
		
/*		
		//字符串截取
		String str = "helloworld";
		String resultA = str.substring(5);    //从指定位置到结尾
		String resultB = str.substring(0,5);  //从指定位置到指定位置结束
		System.out.println(resultA);
		System.out.println(resultB); 
		
*/		
		
		//字符串替换
/*
        String str = "helloworld";
		String resultA = str.replaceAll("l","_");    //全部替换
		String resultB = str.replaceFirst("l","_");  //部分替换
		System.out.println(resultA);
		System.out.println(resultB);
*/
	}

}
