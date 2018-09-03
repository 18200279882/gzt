package bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xjCompare")
public class XjCompare {
	String inputXm;
	String inputZjhm;
	String inputYxmc;
	String inputCc;
	String inputXllb;
	String inputRxrq;
	Wybs wybs;

	@XmlElement(name = "wybs")
	public Wybs getWybs() {
		return wybs;
	}

	public void setWybs(Wybs wybs) {
		this.wybs = wybs;
	}

	Message message;
	YxmcCheckrs yxmcCheckrs;
	XjCheckrs xjCheckrs;

	@XmlAttribute(name = "inputXm")
	public String getInputXm() {
		return inputXm;
	}

	public void setInputXm(String inputXm) {
		this.inputXm = inputXm;
	}

	@XmlAttribute(name = "inputZjhm")
	public String getInputZjhm() {
		return inputZjhm;
	}

	public void setInputZjhm(String inputZjhm) {
		this.inputZjhm = inputZjhm;
	}

	@XmlAttribute(name = "inputYxmc")
	public String getInputYxmc() {
		return inputYxmc;
	}

	public void setInputYxmc(String inputYxmc) {
		this.inputYxmc = inputYxmc;
	}

	@XmlAttribute(name = "inputCc")
	public String getInputCc() {
		return inputCc;
	}

	public void setInputCc(String inputCc) {
		this.inputCc = inputCc;
	}

	@XmlAttribute(name = "inputXllb")
	public String getInputXllb() {
		return inputXllb;
	}

	public void setInputXllb(String inputXllb) {
		this.inputXllb = inputXllb;
	}

	@XmlAttribute(name = "inputRxrq")
	public String getInputRxrq() {
		return inputRxrq;
	}

	public void setInputRxrq(String inputRxrq) {
		this.inputRxrq = inputRxrq;
	}

	@XmlElement(name = "message")
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@XmlElement(name = "yxmcCheckrs")
	public YxmcCheckrs getYxmcCheckrs() {
		return yxmcCheckrs;
	}

	public void setYxmcCheckrs(YxmcCheckrs yxmcCheckrs) {
		this.yxmcCheckrs = yxmcCheckrs;
	}

	@XmlElement(name = "xjCheckrs")
	public XjCheckrs getXjCheckrs() {
		return xjCheckrs;
	}

	public void setXjCheckrs(XjCheckrs xjCheckrs) {
		this.xjCheckrs = xjCheckrs;
	}

	@Override
	public String toString() {
		return "XjCompare [inputXm=" + inputXm + ", inputZjhm=" + inputZjhm + ", inputYxmc=" + inputYxmc + ", inputCc="
				+ inputCc + ", inputXllb=" + inputXllb + ", inputRxrq=" + inputRxrq + ", wybs=" + wybs + ", message="
				+ message + ", yxmcCheckrs=" + yxmcCheckrs + ", xjCheckrs=" + xjCheckrs + "]";
	}

	public XjCompare(String inputXm, String inputZjhm, String inputYxmc, String inputCc, String inputXllb,
			String inputRxrq, Wybs wybs, Message message, YxmcCheckrs yxmcCheckrs, XjCheckrs xjCheckrs) {
		super();
		this.inputXm = inputXm;
		this.inputZjhm = inputZjhm;
		this.inputYxmc = inputYxmc;
		this.inputCc = inputCc;
		this.inputXllb = inputXllb;
		this.inputRxrq = inputRxrq;
		this.wybs = wybs;
		this.message = message;
		this.yxmcCheckrs = yxmcCheckrs;
		this.xjCheckrs = xjCheckrs;
	}

	public XjCompare() {
		super();
	}

}
