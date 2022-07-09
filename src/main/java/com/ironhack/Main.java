package com.ironhack;

import net.datafaker.Faker;

public class Main {
  public static void main(String[] args) {
    var faker = new Faker();

    for (int i = 0; i < 10; i++) {
      var name = faker.name().fullName();
      System.out.println("Hello " + name);
    }

    for (int i = 0; i < 10; i++) {
      var name = faker.shakespeare().romeoAndJulietQuote() ;
      System.out.println("Hello " + name);
    }

  }
}