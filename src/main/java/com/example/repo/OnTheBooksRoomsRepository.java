package com.example.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OnTheBooksRoomsRepository extends MongoRepository<OnTheBooksRooms, String> {

	List<OnTheBooksRooms>  findByPropertyId(String propertyId);
}
