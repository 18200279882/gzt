package bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
@XmlRootElement(name="wybs")
public class Wybs {
	String desc;
	String wybs;
	@XmlAttribute(name="desc")
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@XmlValue
	public String getWybs() {
		return wybs;
	}
	public void setWybs(String wybs) {
		this.wybs = wybs;
	}
	@Override
	public String toString() {
		return "Wybs [desc=" + desc + ", wybs=" + wybs + "]";
	}
	public Wybs(String desc, String wybs) {
		super();
		this.desc = desc;
		this.wybs = wybs;
	}
	public Wybs() {
		super();
	}
	
}
