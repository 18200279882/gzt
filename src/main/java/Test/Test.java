package Test;

import service.ReturnResult;

public class Test {
	public static void main(String[] args) throws Exception {
		String param = "liuwei,111112000101280001,上海大学,硕士,,2017,b8e95a0ced4d43f185e650bb2820caa0";

		System.out.println("PARAM:" + param);
		System.out.println(ReturnResult.returnResult(param));
	}
}
