package com.academy.service;

import java.util.List;
import com.academy.model.entity.Book;

public interface BookService {
  void create(Book book);
  List<Book> getBooks();
}
