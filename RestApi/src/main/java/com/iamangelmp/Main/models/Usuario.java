/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamangelmp.Main.models;

import lombok.Data;

/**
 *
 * @author Alexis
 */
@Data
public class Usuario {
	protected Long id;
	protected String nombre;
	protected String apellido;
	protected String email;
	protected String telefono;
	protected String pass;
	
}
