package com.example.BookAuthorAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookService;

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PostMapping("/add-author")
    public String addAuthor(@RequestBody Author author){
        return bookService.addAuthor(author);
    }

    @GetMapping("Get-highestPageBook")
    public String NoOfBooksHighestPage(){
        return bookService.NoOfBooksHighestPage();
    }

    @PutMapping("/update-book")
    public String updateBook(@RequestParam("bookName") String bookName, @RequestParam("extraPage") int extraPage){
        return bookService.updateBook(bookName, extraPage);
    }

    @GetMapping("get-all-HighestPage-Written-Author")
    public List<Author> authorOFHighestNoPage() {
        return bookService.authorOFHighestNoPage();
    }
}
