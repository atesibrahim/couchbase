package com.ates.couchbase.service;

import com.ates.couchbase.domain.Book;
import com.ates.couchbase.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findById(String id) {
        return bookRepository.findById(id).orElse(Book.builder().build());
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(String id) {
        bookRepository.deleteById(id);
    }
}
