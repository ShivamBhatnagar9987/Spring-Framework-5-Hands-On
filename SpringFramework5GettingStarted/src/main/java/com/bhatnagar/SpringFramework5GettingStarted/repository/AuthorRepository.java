package com.bhatnagar.SpringFramework5GettingStarted.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhatnagar.SpringFramework5GettingStarted.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
