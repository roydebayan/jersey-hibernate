package com.jersey.jersey_hibernate_project;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
    @Id
    private Integer id;
    private String name;
    private Date somedate;
 

    @Column(name = "id")
    public Integer getId() {
        return id;
    }

	public Student() {
	}

	public Student(Integer id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.somedate = date;
	}
	
	@Column(name = "somedate")
	public Date getDate() {
		return somedate;
	}

	public void setDate(Date date) {
		this.somedate = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}