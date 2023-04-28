package com.spring.learnspringboot.courses.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity                        //to map the Course as an entity to the h2 database table
public class Courses {
	
	@Id                       //to set Id field as primary
	@GeneratedValue          //to auto generate the Id field
	private long id;
	private String name;
	private String author;
	
	public Courses() {        //default constructor to retrieve data from database using Courses Rest API
		
	}
	
	public Courses(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		return "Course [id= " + id + ", name= " + name + ", author= " + author + "]";
	}

}
