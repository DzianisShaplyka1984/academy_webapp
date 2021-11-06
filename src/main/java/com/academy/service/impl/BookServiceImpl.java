package com.academy.service.impl;

import com.academy.model.dao.BookDao;
import com.academy.model.entity.Book;
import com.academy.service.BookService;
import com.academy.service.SearchService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
  @Autowired
  private BookDao bookDao;
  private SearchService searchService;
  @Override
  public void create(Book book) {
    if (book == null) {
      System.out.println("Book is null");

      return;
    }

    var year = searchService.search(book.getTitle());

    book.setYear(year);

    bookDao.create(book);
  }

  @Override
  public List<Book> getBooks() {
    return bookDao.getAll();
  }
}
