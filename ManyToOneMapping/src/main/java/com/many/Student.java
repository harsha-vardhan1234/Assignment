package com.many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jakarta.persistence.JoinColumn;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Depart d;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Depart getD() {
		return d;
	}

	public void setD(Depart d) {
		this.d = d;
	}

}
