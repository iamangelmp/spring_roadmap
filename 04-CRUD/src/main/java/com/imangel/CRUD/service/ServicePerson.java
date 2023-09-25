package com.imangel.CRUD.service;

import com.imangel.CRUD.domain.Person;
import java.util.List;

/**
 *
 * @author Alexis
 */
public interface ServicePerson{
    
    public List<Person> getAllPesons();
    
    public void createPerson(Person person);
    
    public void detelePerson(Person person);
    
    public Person getPerson(Person person);
}
