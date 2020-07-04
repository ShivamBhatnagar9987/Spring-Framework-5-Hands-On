package com.bhatnagar.SpringFramework5GettingStarted.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhatnagar.SpringFramework5GettingStarted.repository.AuthorRepository;

@Controller
public class AuthorController {
	private final AuthorRepository AuthorRepository;

	public AuthorController(AuthorRepository AuthorRepository) {
		super();
		this.AuthorRepository = AuthorRepository;
	}

	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", AuthorRepository.findAll());
		return "authors/list";
	}
}
