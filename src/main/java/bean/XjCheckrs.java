package bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class XjCheckrs {
	String desc;

	int xjCheckrs;

	@XmlAttribute(name = "desc")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@javax.xml.bind.annotation.XmlValue
	public int getXjCheckrs() {
		return xjCheckrs;
	}

	public void setXjCheckrs(int xjCheckrs) {
		this.xjCheckrs = xjCheckrs;
	}

	public XjCheckrs(String desc, int xjCheckrs) {
		super();
		this.desc = desc;
		this.xjCheckrs = xjCheckrs;
	}

	public XjCheckrs() {
		super();
	}

	@Override
	public String toString() {
		return "XjCheckrs [desc=" + desc + ", xjCheckrs=" + xjCheckrs + "]";
	}

}
