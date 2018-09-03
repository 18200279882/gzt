package service;

import java.io.UnsupportedEncodingException;

public class Code {
	public static String Encode(String string) {
		byte[] bs = null;
		try {
			bs = Des2.encrypt(string.getBytes("GBK"), "12345678");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return Base64Encrypt.base64Encode(bs);
	}

	public static String Decode(String string) throws Exception {

		byte[] bytes = Base64Encrypt.base64Decode(string);
		return new String(Des2.decrypt(bytes, "12345678"), "GBK");
	}
}
