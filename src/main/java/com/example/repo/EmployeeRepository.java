package com.example.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepository extends MongoRepository<Employee, String> {

	public List<Employee>  findByFirstName(String firstName);
	public List<Employee>  findByFirstNameOrLastName(String firstName, String lastName);
    
    public List<Employee> findByLastName(String lastName);

}
