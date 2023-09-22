package com.imangel.Spring_Data.DAO;

import com.imangel.Spring_Data.Domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexis
 */
public interface PersonDAO extends CrudRepository<Person, Long>{
	
	
}
