package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    
    public void displayRepositoryStatus() {
        if (bookRepository != null) {
            System.out.println("BookRepository has been successfully injected into BookService.");
        } else {
            System.out.println("BookRepository injection failed.");
        }
    }
}
