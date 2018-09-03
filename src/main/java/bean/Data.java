package bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data")
public class Data {

	Message message;
	List<XjCompare> compares;
	
	@XmlElementWrapper(name = "xjCompares")
	@XmlElement(name = "xjCompare")
	public List<XjCompare> getCompares() {
		return compares;
	}

	public void setCompares(List<XjCompare> compares) {
		this.compares = compares;
	}

	@XmlElement(name = "message")
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Data(Message message, List<XjCompare> compares) {
		super();
		this.message = message;
		this.compares = compares;
	}

	public Data() {
		super();
	}

	@Override
	public String toString() {
		return "Data [message=" + message + ", compares=" + compares + "]";
	}

}
