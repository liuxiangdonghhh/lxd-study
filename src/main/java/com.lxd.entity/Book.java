package com.lxd.entity;

import org.springframework.stereotype.Component;

/**
 * 图书实体类
 */
public class Book {
    /*
    * 图书ID
    * **/
    private Long bookId;

    /*
     * 图书名称
     * **/
    private String name;

    /*
     * 馆藏数量
     * **/
    private int number;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Book(Long bookId, String name, int number) {
        this.bookId = bookId;
        this.name = name;
        this.number = number;
    }
    public Book() {

    }
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
