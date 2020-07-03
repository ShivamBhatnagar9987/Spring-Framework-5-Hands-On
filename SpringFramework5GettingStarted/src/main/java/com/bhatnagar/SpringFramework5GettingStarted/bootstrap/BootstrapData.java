package com.bhatnagar.SpringFramework5GettingStarted.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhatnagar.SpringFramework5GettingStarted.entities.Author;
import com.bhatnagar.SpringFramework5GettingStarted.entities.Book;
import com.bhatnagar.SpringFramework5GettingStarted.entities.Publisher;
import com.bhatnagar.SpringFramework5GettingStarted.repository.AuthorRepository;
import com.bhatnagar.SpringFramework5GettingStarted.repository.BookRepository;
import com.bhatnagar.SpringFramework5GettingStarted.repository.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		Book b2 = new Book();
		Author a1 = new Author();
		Author a2 = new Author();
		Publisher p1 = new Publisher();
		publisherRepository.save(p1);
		System.out.println("publisher count" + publisherRepository.count());
		b1.setPublisher(p1);
		p1.getBooks().add(b1);
		authorRepository.save(a1);
		bookRepository.save(b1);
		publisherRepository.save(p1);
		b2.setPublisher(p1);
		p1.getBooks().add(b2);
		authorRepository.save(a2);
		bookRepository.save(b2);
		publisherRepository.save(p1);
		System.out.println("Number of books: " + bookRepository.count());
		System.out.println("Publisher no. of books: " + p1.getBooks().size());
		System.out.println("publisher count" + publisherRepository.count());
	}
}
