package com.qnchat.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operations")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "name")
	 private String name;
	@Column(name = "title")
	private String title;
	@Column(name = "hobby")
	private String hobby;
	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation( String name, String title, String hobby) {
		super();
		this.name = name;
		this.title = title;
		this.hobby = hobby;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Operation [Id=" + id + ", name=" + name + ", title=" + title + ", hobby=" + hobby + "]";
	}
	
	
	

}
