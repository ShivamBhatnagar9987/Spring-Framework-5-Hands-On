package com.bhatnagar.SpringFramework5GettingStarted.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@ManyToMany(mappedBy = "books")
	private Set<Author> authors;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String isbn;
	private String name;

	public Book() {

	}

	public Book(String name, String isbn) {
		this.name = name;
		this.isbn = isbn;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public long getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [authors=" + authors + ", id=" + id + ", isbn=" + isbn + ", name=" + name + "]";
	}

}
