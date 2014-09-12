package cn.fyg.mb.domain.blog;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Post {
	
	private int id;
	
	private String subject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
