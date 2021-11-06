package com.academy.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {
  @Id
  @GeneratedValue
  private Integer id;
  @Column
  private String title;
  @Column
  private int year;
  @ManyToOne
  @JoinColumn(name="author_id")
  private Author author;
}
