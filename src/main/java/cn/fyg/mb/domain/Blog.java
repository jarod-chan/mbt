package cn.fyg.mb.domain;

import java.util.Date;

import javax.xml.crypto.Data;

public class Blog {
	
	private int id;
	
	private String title;

	private String context;
	
	private Date create_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	


	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
	
}
