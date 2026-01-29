package com.example.Book;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {


    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().getBooks();
        Collections. sort(books, new myComparator());
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

class myComparator implements Comparator<Book> {
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}