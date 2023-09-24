package com.imangel.Spring_Data.service;

import com.imangel.Spring_Data.Domain.Person;
import java.util.List;

/**
 *
 * @author Alexis
 */
public interface PersonService {
	
	public List<Person> ListPersons();
	
	public void savePerson(Person person);
	
	public void deletePerson(Person person);
	
	public Person searchPerson(Person person);
	
}
