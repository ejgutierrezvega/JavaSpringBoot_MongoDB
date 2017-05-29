package com.learning.profile.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.profile.models.Person;
import com.learning.repository.IPersonRepository;

@RestController
@RequestMapping("/v1")
public class ProfileController extends BaseController {

	@Autowired
	ProfileController(IPersonRepository repo){
		super(repo);
	}
	
	@RequestMapping(value="/profiles", method=RequestMethod.GET)
	public List<Person> Get(){
		return this.getPersonRepo().findAll();
	}
	
	@RequestMapping(value="/profiles", method=RequestMethod.POST)
	public Person Post(@RequestBody Person person){
		
		person.setId(UUID.randomUUID().toString());
		Person result = this.getPersonRepo().save(person);
		
		return result;
	}
}