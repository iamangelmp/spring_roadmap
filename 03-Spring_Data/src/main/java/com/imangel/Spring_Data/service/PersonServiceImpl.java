package com.imangel.Spring_Data.service;

import com.imangel.Spring_Data.DAO.PersonDAO;
import com.imangel.Spring_Data.Domain.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alexis
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Person> ListPersons() {
		return (List<Person>) personaDao.findAll();
	}

	@Override
	@Transactional
	public void savePerson(Person person) {
		personaDao.save(person);
	}

	@Override
	@Transactional
	public void deletePerson(Person person) {
		personaDao.delete(person);
	}

	@Override
	@Transactional(readOnly = true)
	public Person searchPerson(Person person) {
		List<Long> userIds = new ArrayList<>();
		userIds.add(person.getUser_id());
		return (Person) personaDao.findAllById(userIds);

	}

}
