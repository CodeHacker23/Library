package org.example.menu;

import org.example.entity.Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Book[] books = new Book[120];

    public void initializeBooks() {
        books[0] = new Book("Айзек Азимов", "Я, робот", 25.99, 1950, " Научная фантастика");
        books[1] = new Book("Александр Дюма", "Граф Монте-Кристо", 28.75, 1844, "Приключения");
        books[2] = new Book("Дж. Р. Р. Толкин", "Властелин колец", 35.50, 1954, "Фэнтези");
        books[3] = new Book("Харпер Ли", "Убить пересмешника", 18.75, 1960, "Роман");
        books[4] = new Book("Джордж Оруэлл", "1984", 20.00, 1949, "Дистопия");
        books[5] = new Book("Фрэнсис Скотт Фицджеральд", "Великий Гэтсби", 22.30, 1925, "Роман");
        books[6] = new Book("Александр Дюма", "Граф Монте-Кристо", 28.75, 1844, "Приключения");
        books[7] = new Book("Джейн Остин", "Гордость и предубеждение", 19.90, 1813, "Роман");
        books[8] = new Book("Эрих Мария Ремарк", "Три товарища", 24.50, 1936, "Роман");
        books[9] = new Book("Агата Кристи", "Десять негритят", 15.80, 1939, "Детектив");
        books[10] = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 17.25, 1953, "Научная фантастика");
        books[11] = new Book("Лев Толстой", "Война и мир", 29.99, 1869, "Роман");
        books[12] = new Book("Дж. К. Роулинг", "Гарри Поттер и философский камень", 23.45, 1997, "Фэнтези");
        books[13] = new Book("Марк Твен", "Приключения Тома Сойера", 16.80, 1876, "Приключения");
        books[14] = new Book("Джордж Мартин", "Игра престолов", 30.20, 1996, "Фэнтези");
        books[15] = new Book("Джеймс Гослинг", "Философия Java", 1200.00, 2008, " Техническая литература");
        books[16] = new Book("Иван Порубель", "Java. Методы программирования", 850.00, 2015, "Обучение");
        books[17] = new Book("Джошуа Блох", " Java. Эффективное программирование", 1150.00, 2014, " Техническая литература");
        books[18] = new Book("Игорь Блинов", "Основы Java", 950.00, 2020, "Обучение");
        books[19] = new Book("Александр Зыбин", "Java. Методы программирования. 50 уроков", 1050.00, 2021, "Техническая литература");
    }


    public void start() {
        initializeBooks();
        while (true) {
            System.out.println("1 - добавить книгу в библиотеку");
            System.out.println("2 - Вывести список всех книг");
            System.out.println("3 - вывести список все книг по жанру");
            System.out.println("4 - вывести информацию о книге по названию");
            System.out.println("5 - вывести все книги по стоимости");
            System.out.println("6 - вывести все книг по году выпуска");
            System.out.println("7 - выйти");

            String answer = scanner.nextLine();

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
                    printBooksByPrice();
                }
                case "6" -> {
                    printBookBySelectYear600();
                }

                case "7" -> {
                    System.exit(0);
                }
            }
        }


    }

    public void printBooksByPrice() {
        String answer;
        while (true) {
            System.out.println("Вывод книг в порядке возрастании цены нажмите: +" +
                    "\nВывод книг в порядке убывании цены  нажмите: - ");
            answer = scanner.nextLine();
            if (answer.equals("+")) {
                printPriceBookUp5();
                break;
            } else if (answer.equals("-")) {
                printPriceBookDown5();
                break;
            } else System.out.println("НЕ ВЕРНАЯ КОМАНДА!!! ВВЕДИТЕ ЗАНОВО!");


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

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                System.out.println("Книга добавлена в библиотеку");
                return;
            }
        }

        System.out.println("Библиотека полна, невозможно добавить книгу");
    }


    public void methods2() {
        System.out.println("Список всех книг в библиотеке: ");
        for (Book book : books) {
            if (book != null) {
                book.info();
            }
        }
    }


    public void printPriceBookDown5() {
        System.out.println("Книги по стоимости в порядке уменьшении цены :");
        if (books != null) {
            // Сортировка пузырьком по цене от большей к меньшей
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = 0; j < books.length - i - 1; j++) {
                    if (books[j] != null && books[j + 1] != null &&
                            books[j].getPrice() < books[j + 1].getPrice()) {

                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }

            // Вывод названий и цен отсортированных книг
            for (Book book : books) {
                if (book != null) {
                    System.out.println("Название книги : " + book.getTitle() + " , Стоимость  : " + book.getPrice());
                }
            }
        }
    }

    public void printPriceBookUp5() {
        System.out.println("Книги по стоимости в порядке увеличении цены цены :");
        if (books != null) {
            // Сортировка пузырьком по цене от большей к меньшей
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = 0; j < books.length - i - 1; j++) {
                    if (books[j] != null && books[j + 1] != null &&
                            books[j].getPrice() > books[j + 1].getPrice()) {

                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }

            // Вывод названий и цен отсортированных книг
            for (Book book : books) {
                if (book != null) {
                    System.out.println("Название книги : " + book.getTitle() + " , Стоимость  : " + book.getPrice());
                }
            }
        }
    }

    private void printBookBySelectYear600() {
        System.out.println("Введите год выпуска :");

        boolean flag = false; // Флаг

        while (true) {
            int answer;

            try {
                answer = scanner.nextInt(); // Считываем введенное число
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите корректное число.");
                scanner.next(); // Очищаем буфер ввода от некорректных данных
                continue; // Перезапускаем цикл для новой попытки ввода
            }

            int coins = 0;

            for (Book book : books) {
                if (book != null && answer == book.getYear()) {
                    coins++;
//                    System.out.println("Название книги : " + book.getTitle() + " , Год  : " + book.getYear());
                    flag = true; // Устанавливаем флаг, что найдена хотя бы одна книга
                }
            }

            if (coins == 0) {
                System.out.println("По выбранному году книги нет ");
            }

            if (flag) {
                System.out.println("Всего количество результатов : " + coins);
                for (Book book : books) {
                    if (book != null && answer == book.getYear()) {
                        coins++;
                        System.out.println("Название книги : " + book.getTitle() + " , Год  : " + book.getYear());
                    }
                    flag = true;
                }
                System.out.println("Для выхода нажмите : выход ");
                if (scanner.nextLine().equalsIgnoreCase("выход")) {
                    break;
                }
            }


        }


    }
}