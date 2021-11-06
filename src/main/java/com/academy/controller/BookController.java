package com.academy.controller;

import com.academy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
  @Autowired
  private BookService bookService;
  @GetMapping(value="/books")
  public String books(Model model) {
    var books = bookService.getBooks();

    model.addAttribute("books", books);
    return "books";
  }
}
