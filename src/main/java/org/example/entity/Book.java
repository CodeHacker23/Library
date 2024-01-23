package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //за конструктор товечает
public class Book {
    private String author; //  автор
    private String title; // название книги
    private double price; // прайс
    private int year; //год
    private String genre; // жанр

    public Book() {

    }


    public void info() {
        System.out.println("Автор: " + getAuthor());
        System.out.println("Название: " + getTitle());
        System.out.println("Цена: " + getPrice());
        System.out.println("Год издания: " + getYear());
        System.out.println("Жанр: " + getGenre());
        System.out.println("--------------------------");


    }


    public void compareTo() {
    }
}











