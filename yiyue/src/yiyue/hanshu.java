package yiyue;

import java.util.function.Function;

public class hanshu {

	public static void main(String[] args) {
		Function<String, Boolean> msg = "##hello" :: startsWith ;
		System.out.println(msg.apply("##"));

	}

}
