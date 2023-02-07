package com.example.BookAuthorAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String addBook(Book book){
        return bookRepository.addBook(book);
    }

    public String addAuthor(Author author){
        return bookRepository.addAuthor(author);
    }

    public String NoOfBooksHighestPage(){
        return bookRepository.NoOfBooksHighestPage();
    }

    public String updateBook(String bookName, int extraPage){
        return bookRepository.updateBook(bookName, extraPage);
    }
    public List<Author> authorOFHighestNoPage() {
        return bookRepository.authorOFHighestNoPage();
    }
}
