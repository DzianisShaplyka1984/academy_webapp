package com.academy.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {
  @Id
  @GeneratedValue
  private Integer id;
  @Column
  private String name;
  @OneToMany(mappedBy = "author")
  private List<Book> books;
}
