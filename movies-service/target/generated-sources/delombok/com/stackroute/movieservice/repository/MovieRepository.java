package com.stackroute.movieservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.stackroute.movieservice.domain.Movie;

public interface MovieRepository extends MongoRepository<Movie,Integer> {
	
}
