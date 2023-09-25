package com.imangel.CRUD.DAO;

import com.imangel.CRUD.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author XMF2989_1
 */
public interface PersonDAO extends CrudRepository<Person, Long>{
    
}
