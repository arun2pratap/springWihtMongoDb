package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface OnTheBooksRoomsPaceRepository extends MongoRepository<OnTheBooksRoomsPace, String> {

	List<OnTheBooksRoomsPace>  findByPropertyId(String propertyId);

}
