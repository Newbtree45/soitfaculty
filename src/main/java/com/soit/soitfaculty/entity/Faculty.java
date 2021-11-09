package com.soit.soitfaculty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class Faculty {
	
	
	//Set the filed
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="email")
	private String email;

	/***
	 * A blank Faculty constructor
	 */
	public Faculty() {

	}

	/***
	 * A Faculty constructor that takes parameters.
	 * 
	 * @param id        Id of the faculty
	 * @param firstName First name of the faculty
	 * @param lastName  Last name of the faculty
	 * @param email     Email of the faculty
	 */
	public Faculty(int id, String firstName, String lastName,String title, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.email = email;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// To String method
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", title="+ title + ", email=" + email + "]";
	}

}
