/**
 * 
 */
package com.kenta.tabuchi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author tabuchikenta
 *
 */

@Entity
@Table(name="notes")
public class Note {
	
	@OneToOne(cascade = CascadeType.ALL)
	@Column(nullable = true)
	private Category category;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	protected Long id;
	
	@Column
	protected String category_code;
	
	@Column
	protected String time_stamp;
	
	@Column
	protected String title;
	
	@Column
	protected String body;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory_code() {
		return category_code;
	}
	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
