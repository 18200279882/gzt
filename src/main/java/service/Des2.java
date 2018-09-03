package service;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Des2 {

	/**
	 * 
	 * 
	 * @param data
	 * @param sKey
	 * @return
	 */
	public static byte[] encrypt(byte[] data, String sKey) {
		try {
			byte[] key = sKey.getBytes();
			// ��ʼ������
			IvParameterSpec iv = new IvParameterSpec(key);
			DESKeySpec desKey = new DESKeySpec(key);
			// ����һ���ܳ׹�����Ȼ��������DESKeySpecת����securekey
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey securekey = keyFactory.generateSecret(desKey);
			// Cipher����ʵ����ɼ��ܲ���
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			// ���ܳ׳�ʼ��Cipher����
			cipher.init(1, securekey, iv);
			// ���ڣ���ȡ���ݲ�����
			// ��ʽִ�м��ܲ���
			return cipher.doFinal(data);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ����
	 * 
	 * @param src
	 * @param sKey
	 * @return
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] src, String sKey) throws Exception {
		byte[] key = sKey.getBytes();
		// ��ʼ������
		IvParameterSpec iv = new IvParameterSpec(key);
		// ����һ��DESKeySpec����
		DESKeySpec desKey = new DESKeySpec(key);
		// ����һ���ܳ׹���
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		// ��DESKeySpec����ת����SecretKey����
		SecretKey securekey = keyFactory.generateSecret(desKey);
		// Cipher����ʵ����ɽ��ܲ���
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		// ���ܳ׳�ʼ��Cipher����
		cipher.init(2, securekey, iv);
		// ������ʼ���ܲ���
		return cipher.doFinal(src);
	}

}