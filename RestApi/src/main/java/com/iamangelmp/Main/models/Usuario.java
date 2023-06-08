/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamangelmp.Main.models;

import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author Alexis
 */
@Entity
@Table(name="user")
@ToString @EqualsAndHashCode
public class Usuario {
	
	@Id
	@Getter @Setter @Column(name = "id_user")
	protected Long id;
	
	@Getter @Setter @Column(name = "user_nombre")
	protected String nombre;
	
	@Getter @Setter @Column(name = "user_apellido")
	protected String apellido;
	
	@Getter @Setter @Column(name = "user_email")
	protected String email;
	
	@Getter @Setter @Column(name = "user_telefono")
	protected String telefono;
	
	@Getter @Setter @Column(name = "user_password")
	protected String password;
	
}
