package com.example.Book;

public class Book {

    private String name;
    private int id;
    private int pages;

    public Book(int id  , String name , int pages){
        super();
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pages=" + pages +
                '}';
    }


}
