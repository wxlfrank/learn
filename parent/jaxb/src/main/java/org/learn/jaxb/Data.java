package org.learn.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {

	private String uri;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
