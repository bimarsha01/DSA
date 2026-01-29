package com.example.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {


    public List<Book> getBooks() {
        List<Book> books;
            books = new ArrayList<>();
            books.add(new Book(101, "java", 400));
            books.add(new Book(102, "java-together", 401));
            books.add(new Book(102, "python-together", 401));
            books.add(new Book(102, "c++ together", 401));
            return books;
        }

    }

