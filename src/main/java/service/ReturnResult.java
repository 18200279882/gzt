package service;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import bean.Data;
import bean.Message;
import bean.Wybs;
import bean.XjCheckrs;
import bean.XjCompare;
import bean.YxmcCheckrs;

public class ReturnResult {
	public static String returnResult(String param) {
		Data data = new Data();

		Message message1 = new Message();

		String[] strings = param.split(",");
		if (strings[1].substring(0, 6).equals("999999")) {
			message1.setStatus(-9997);
			message1.setValue("你无权查询数据");
			data.setMessage(message1);
		} else {
			message1.setStatus(0);
			message1.setValue("处理成功");
			data.setMessage(message1);
			List<XjCompare> compares = new ArrayList<XjCompare>();
			XjCompare xjCompare = new XjCompare();
			xjCompare.setInputXm(strings[0]);
			xjCompare.setInputZjhm(strings[1]);
			xjCompare.setInputYxmc(strings[2]);
			xjCompare.setInputCc(strings[3]);
			xjCompare.setInputXllb(strings[4]);
			xjCompare.setInputRxrq(strings[5]);
			Wybs wybs = new Wybs();
			wybs.setDesc("唯一标识");
			wybs.setWybs(strings[6]);
			xjCompare.setWybs(wybs);

			Message message2 = new Message();
			if (xjCompare.getInputZjhm().substring(0, 6).equals("111111")) {
				message2.setStatus(1);
				message2.setValue("查询成功_无数据");
				xjCompare.setMessage(message2);
				compares.add(xjCompare);
				data.setCompares(compares);
			} else {
				message2.setStatus(0);
				message2.setValue("查询成功_有数据");
				xjCompare.setMessage(message2);

				XjCheckrs xjCheckrs = new XjCheckrs();

				if (xjCompare.getInputZjhm().substring(6, 10).equals("0000")) {
					xjCheckrs.setDesc("学籍比对结果");
					xjCheckrs.setXjCheckrs(0);
					xjCompare.setXjCheckrs(xjCheckrs);
					compares.add(xjCompare);
					data.setCompares(compares);
				} else {
					xjCheckrs.setDesc("学籍比对结果");
					xjCheckrs.setXjCheckrs(1);
					xjCompare.setXjCheckrs(xjCheckrs);
					YxmcCheckrs yxmcCheckrs = new YxmcCheckrs();
					if (xjCompare.getInputZjhm().substring(14).equals("0000")) {
						yxmcCheckrs.setDesc("院校比对结果");
						yxmcCheckrs.setYxmcCheckrs(0);

					} else {
						yxmcCheckrs.setDesc("院校比对结果");
						yxmcCheckrs.setYxmcCheckrs(1);
					}
					xjCompare.setYxmcCheckrs(yxmcCheckrs);
					compares.add(xjCompare);
					data.setCompares(compares);
				}
			}

		}

		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Data.class);// ��ȡ�����Ķ���
			Marshaller marshaller = context.createMarshaller();// ���������Ļ�ȡmarshaller����
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); // ���ñ����ַ���
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // ��ʽ��XML������з��к�����

			System.out.println("服务器端返回的未加密的报文：");

			marshaller.marshal(data, System.out);// ��ӡ������̨
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			marshaller.marshal(data, baos);
			String xmlObj = new String(baos.toByteArray()); // ����XML�ַ���
			String result = Code.Encode(xmlObj);

			System.out.println("服务器端返回的加密的报文：" + result);

			return result;
		} catch (JAXBException e) {

			e.printStackTrace();
		}
		return null;
	}
}
