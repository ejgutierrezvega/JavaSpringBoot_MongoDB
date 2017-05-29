package com.learning.profile.controller;

import com.learning.repository.IPersonRepository;

public abstract class BaseController {

	private final IPersonRepository personRepo;
	
	public IPersonRepository getPersonRepo() {
		return personRepo;
	}

	BaseController(IPersonRepository repo){
		this.personRepo = repo;
	}
}
