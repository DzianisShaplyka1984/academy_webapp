package com.academy.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;

public class DataSourceManager {
  private static DataSourceManager instance = new DataSourceManager();
  private static EntityManagerFactory emFactory;

  public static DataSourceManager getInstance() {

    if (instance == null) {
      instance = new DataSourceManager();
    }

    return instance;
  }

  private DataSourceManager() {
    emFactory = Persistence.createEntityManagerFactory("by.it_academy");
  }

  public EntityManager getEntityManager() {
    return emFactory.createEntityManager();
  }

  public Session getSession(){
    return emFactory.createEntityManager().unwrap(Session.class);
  }
}