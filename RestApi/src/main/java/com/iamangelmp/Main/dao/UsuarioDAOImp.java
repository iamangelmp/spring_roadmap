/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamangelmp.Main.dao;

import com.iamangelmp.Main.dao.UsuarioDAO;
import com.iamangelmp.Main.models.Usuario;
import jakarta.persistence.*;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Alexis
 */
@Repository
@Transactional
public class UsuarioDAOImp implements UsuarioDAO{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public List<Usuario> getAllUsers() {
		String query = "FROM Usuario";
		List<Usuario> resultado = entityManager.createQuery(query).getResultList();
		System.out.println("----------------------------------->"+resultado);
		return resultado;
	}

	@Override
	public void deleteById(Long id) {
		Usuario usuario = entityManager.find(Usuario.class, id);
		System.out.println("------------------------------------------- > usuario = " +  usuario);
		entityManager.remove(usuario);
	}

	@Override
	public Usuario getUserById(Long id) {
		var response = entityManager.find(Usuario.class, id);
		return response;
	}

	
}
