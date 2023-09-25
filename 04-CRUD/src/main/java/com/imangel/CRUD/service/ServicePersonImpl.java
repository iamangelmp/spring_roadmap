package com.imangel.CRUD.service;

import com.imangel.CRUD.DAO.PersonDAO;
import com.imangel.CRUD.domain.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alexis
 */
@Service
public class ServicePersonImpl implements ServicePerson{
    
    @Autowired
    private PersonDAO personDao;

    @Override
    @Transactional(readOnly = true)
    public List<Person> getAllPesons() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional()
    public void createPerson(Person person) {
        personDao.save(person);
    }

    @Override
    @Transactional()
    public void detelePerson(Person person) {
        personDao.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person getPerson(Person person) {
        return personDao.findById(person.getUser_id()).orElse(null);
    }
	
}
