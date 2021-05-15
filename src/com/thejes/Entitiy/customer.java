package com.thejes.Entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class customer {
    @Id
    @Column
	private int id;
	@Column
	
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	public customer(String first_name, String last_name, String email) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	public customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ "]";
	}
	
	
	
	
}
