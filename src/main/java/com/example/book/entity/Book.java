package com.example.book.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookName;
    private String author;
    private int publishYear;
    private LocalDate dbUpdateDate;

    // Constructors
    public Book() {
    }

    public Book(String bookName, String author, int publishYear, LocalDate dbUpdateDate) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
        this.dbUpdateDate = dbUpdateDate;
    }

    // Getters and Setters
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public LocalDate getDbUpdateDate() {
        return dbUpdateDate;
    }

    public void setDbUpdateDate(LocalDate dbUpdateDate) {
        this.dbUpdateDate = dbUpdateDate;
    }

    // toString method (optional for printing)
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", dbUpdateDate=" + dbUpdateDate +
                '}';
    }
}