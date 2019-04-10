package testdemo;

public class StringDemo5 {

	public static void main(String[] args) {
	String stra = "##@@helloworld##";
	System.out.println(stra.startsWith("##"));    //判断是否以谁开始
	System.out.println(stra.startsWith("@@",2));  //
	System.out.println(stra.endsWith("##"));      //判断是否以谁结尾
     
	
	//判断是否找到相应字符串
/*
	if(stra.contains("hello")) {          //contains（）返回boolean值
		System.out.println("查询到结果");
	}
	else {
		System.out.println("没有查询到结果");
	}
*/
	
	
	
	//判断查询字母的位置
/*
	System.out.println(stra.indexOf("world"));    //返回满足第一个字母位置的索引
	System.out.println(stra.indexOf("l"));        //返回第一个满足的索引
	System.out.println(stra.indexOf("l",5));      //返回第5个之后满足的索引
	System.out.println(stra.lastIndexOf("l"));    //返回最后一个字母位置的索引 
*/	
	}

}
