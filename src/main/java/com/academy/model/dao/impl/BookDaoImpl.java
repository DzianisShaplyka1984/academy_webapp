package com.academy.model.dao.impl;

import java.util.List;
import javax.persistence.Query;
import com.academy.model.DataSourceManager;
import com.academy.model.dao.BookDao;
import com.academy.model.entity.Book;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

  @Override
  public void create(Book item) {
    var entityManager = DataSourceManager.getInstance().getEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(item);
    entityManager.getTransaction().commit();
  }

  @Override
  public void update(Book item) {

  }

  @Override
  public void delete(Book item) {

  }

  @Override
  public List<Book> getAll() {
    Session session = DataSourceManager.getInstance().getSession();
    Query query = session.createQuery("from Book");

    return query.getResultList();
  }

  @Override
  public Book getById(Integer id) {
    return null;
  }
}
