package org.antwalk;

public class CustomerService {
	private String name;
	private String url;
	
	public void getName() {
		System.out.println("Name is " +name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getUrl() {
		System.out.println("url is " +url);
	}
	public void setUrl(String url) {
		this.url = url;
	}	

}
