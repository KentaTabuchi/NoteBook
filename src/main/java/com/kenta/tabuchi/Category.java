package com.kenta.tabuchi;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
	@OneToOne
	private Note note;
	public Category() {
		super();
		note = new Note();
	}
	protected String code;
	protected String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
