package com.bhatnagar.SpringFramework5GettingStarted.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhatnagar.SpringFramework5GettingStarted.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
