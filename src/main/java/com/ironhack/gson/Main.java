package com.ironhack.gson;

import com.google.gson.Gson;
import net.datafaker.Faker;

public class Main {

  public static void main(String[] args) {

    var faker = new Faker();
    var gson = new Gson();

    var book = new Book(1,
            faker.book().title(),
            faker.book().author(),
            faker.book().genre(),
            faker.code().isbn10()
    );

    System.out.println(book);

    var bookAsJson = gson.toJson(book);
    System.out.println("********** JSON **********");
    System.out.println(bookAsJson);
  }
}
