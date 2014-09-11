package cn.fyg.mb.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Tag {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
