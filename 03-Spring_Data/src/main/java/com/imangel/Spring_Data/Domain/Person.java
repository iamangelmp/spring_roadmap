package com.imangel.Spring_Data.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Alexis
 */
@Data
@Entity
@Table(name="person")
public class Person {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	protected Long user_id;
	
	@Column(name = "user_name")
	protected String user_name;
	
	@Column(name = "user_last_name")
	protected String user_last_name;
	
	@Column(name = "user_email")
	protected String user_email;
	
	@Column(name = "user_phone")
	protected String user_phone;
	
}
