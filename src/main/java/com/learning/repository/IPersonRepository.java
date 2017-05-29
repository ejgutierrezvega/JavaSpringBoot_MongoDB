package com.learning.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learning.profile.models.Person;

public interface IPersonRepository extends MongoRepository<Person, String> {

	public Person findById(String Id);
}
