package bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "yxmcCheckrs")
public class YxmcCheckrs {
	String desc;
	int yxmcCheckrs;

	@XmlAttribute(name = "desc")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@javax.xml.bind.annotation.XmlValue
	public int getYxmcCheckrs() {
		return yxmcCheckrs;
	}

	public void setYxmcCheckrs(int yxmcCheckrs) {
		this.yxmcCheckrs = yxmcCheckrs;
	}

	public YxmcCheckrs(String desc, int yxmcCheckrs) {
		super();
		this.desc = desc;
		this.yxmcCheckrs = yxmcCheckrs;
	}

	public YxmcCheckrs() {
		super();
	}

	@Override
	public String toString() {
		return "YxmcCheckrs [desc=" + desc + ", yxmcCheckrs=" + yxmcCheckrs + "]";
	}

}
