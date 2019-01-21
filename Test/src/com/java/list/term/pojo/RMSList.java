package com.java.list.term.pojo;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RMSList")
public class RMSList {

	String name;
	String ListId;
	
	//int pin;
	@XmlAttribute
	public String getListId() {
		return ListId;
	}

	public void setListId(String listId) {
		ListId = listId;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @XmlAttribute public int getPin() { return pin; }
	 * 
	 * public void setPin(int pin) { this.pin = pin; }
	 */

}
