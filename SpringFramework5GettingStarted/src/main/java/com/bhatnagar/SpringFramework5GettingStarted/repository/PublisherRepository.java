package com.bhatnagar.SpringFramework5GettingStarted.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhatnagar.SpringFramework5GettingStarted.entities.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
