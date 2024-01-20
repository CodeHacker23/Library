package org.example.menu;

import org.example.entity.Book;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Book[] newBooks = new Book[100];

    public void initializeBooks() {
        newBooks[0] = new Book("Айзек Азимов", "Я, робот", 25.99, 1950, " Научная фантастика");
        newBooks[1] = new Book("Александр Дюма", "Граф Монте-Кристо", 28.75, 1844, "Приключения");
        newBooks[2] = new Book("Дж. Р. Р. Толкин", "Властелин колец", 35.50, 1954, "Фэнтези");
        newBooks[3] = new Book("Харпер Ли", "Убить пересмешника", 18.75, 1960, "Роман");
        newBooks[4] = new Book("Джордж Оруэлл", "1984", 20.00, 1949, "Дистопия");
        newBooks[5] = new Book("Фрэнсис Скотт Фицджеральд", "Великий Гэтсби", 22.30, 1925, "Роман");
        newBooks[6] = new Book("Александр Дюма", "Граф Монте-Кристо", 28.75, 1844, "Приключения");
        newBooks[7] = new Book("Джейн Остин", "Гордость и предубеждение", 19.90, 1813, "Роман");
        newBooks[8] = new Book("Эрих Мария Ремарк", "Три товарища", 24.50, 1936, "Роман");
        newBooks[9] = new Book("Агата Кристи", "Десять негритят", 15.80, 1939, "Детектив");
        newBooks[10] = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 17.25, 1953, "Научная фантастика");
        newBooks[11] = new Book("Лев Толстой", "Война и мир", 29.99, 1869, "Роман");
        newBooks[12] = new Book("Дж. К. Роулинг", "Гарри Поттер и философский камень", 23.45, 1997, "Фэнтези");
        newBooks[13] = new Book("Марк Твен", "Приключения Тома Сойера", 16.80, 1876, "Приключения");
        newBooks[14] = new Book("Джордж Мартин", "Игра престолов", 30.20, 1996, "Фэнтези");
        newBooks[15] = new Book("Джеймс Гослинг", "Философия Java", 1200.00, 2008, " Техническая литература");
        newBooks[16] = new Book("Иван Порубель", "Java. Методы программирования", 850.00, 2015, "Обучение");
        newBooks[17] = new Book("Джошуа Блох", " Java. Эффективное программирование", 1150.00, 2014, " Техническая литература");
        newBooks[18] = new Book("Игорь Блинов", "Основы Java", 950.00, 2020, "Обучение");
        newBooks[19] = new Book("Александр Зыбин", "Java. Методы программирования. 50 уроков", 1050.00, 2021, "Техническая литература");
    }


    public void start() {
        initializeBooks();
        while (true) {
            System.out.println("3 - вывести список все книг по жанру");
            System.out.println("4 - вывести информацию о книге по названию");
            System.out.println("5 - вывести все книги по стоимости");
            System.out.println("6 - вывести все книг по году выпуска");
            System.out.println("7 - выйти");

            //String answer = scanner.nextLine();

            switch (answer) {
                case "1" -> {
                    methods1();
                }
                case "2" -> {
                    methods2();
                }

                case "3" -> {
                    //methods3();
                }
                case "4" -> {
                    // methods4();
                }
                case "5" -> {
//


                }
                case "6" -> {

                }

                case "7" -> {
                    System.exit(0);
                }
            }
        }


    }


    public void methods1() {

        System.out.println("Введите автора книги: ");
        String author = scanner.nextLine();

        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.println("Введите цену книги:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // очистить буфер

        System.out.println("Введите год выпуска книги:");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите жанр книги:");
        String genre = scanner.nextLine();

        // Создаем новый объект книги
        Book newBook = new Book(author, title, price, year, genre);

        // Добавляем книгу в первое свободное место в массиве

        for (int i = 0; i < newBooks.length; i++) {
            if (newBooks[i] == null) {
                newBooks[i] = newBook;
                System.out.println("Книга добавлена в библиотеку");
                return;
            }
        }

        System.out.println("Библиотека полна, невозможно добавить книгу");
    }


    public void methods2() {
        System.out.println("Список всех книг в библиотеке: ");
        for (Book book : newBooks) {
            if (book != null) {
                book.info();
            }
        }
    }


//

}

//    public void methods3 (){
//        System.out.println("Cписок всех книг по жанру и названию ");
//        for (int i = 0; i < books.length; i++) {
//            if(books[i] != null){
//                System.out.println(books[i].getTitle() +  " " + books[i].getGenre());
//            }
//        }
//    }
//
//    public void methods4 (){
//        String name = scanner.nextLine();
//        System.out.println("вывести информацию о книге по названию");
//        System.out.println("=======================================");
//        for (int i = 0; i < books.length; i++) {
//            if ( name.equals(books[i].getTitle())) {
//                System.out.println(books[i].getAuthor() + " " + books[i].getTitle() + " " + books[i].getPrice() + " " + books[i].getYear() + " " + books[i].getGenre());
//                return;
//            }
//        }
//        System.out.println("Такой книги не существует, попробуйте еще раз! ");
//    }
//    public void methods5 (){ //вывести все книги по стоимости");
//
//    }
//    public void methods6 (){
//
//    }
//    public void methods7 (){
//
//    }







