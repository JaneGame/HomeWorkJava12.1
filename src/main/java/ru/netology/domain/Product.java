package ru.netology.domain;

import java.util.Objects;

public class Product {
  private int id;
  private String name;
  private int price;

  public Product() {
  }

  public Product(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return id;
  }


  public String getName() {
    return name;
  }


  public int setPrice(int price) {
    this.price = price;
    return price;
  }
}




