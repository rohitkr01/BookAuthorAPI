package com.example.BookAuthorAPI;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {


    Map<String,Book> db_book = new HashMap<>();         // map for bookName -> Book class

    Map<String,Author> db_Author = new HashMap<>();     // map for authorName -> Author Class

    //Add Book
    public String addBook(Book book){
        String bookName = book.getBookName();
        if(db_book.containsKey(bookName) ){
            return "Book Already in database";
        }

        db_book.put(bookName,book);
        return "Book Added Successfully";
    }

    public String addAuthor(Author author){
        String authorName = author.getAuthorName();
        if(db_Author.containsKey(authorName)){
            return "Author already in database";
        }

        db_Author.put(authorName,author);
        return "Author Added Successfully";
    }

    //GET - Get book with highest no of page
    public String NoOfBooksHighestPage(){
        int HighestPage = 0;
        Book ansBook = null;
        for(Book book : db_book.values()){
            if(book.getPages() > HighestPage){
                HighestPage = book.getPages();
                ansBook = book;
            }
        }
        return ansBook.getBookName();
    }

    // PUT - Update bookName by extra No. of pages
    public String updateBook(String bookName, int extraPage){
        if(db_book.containsKey(bookName) == false){
            return "Book not in database, can't update !";
        }
        int oldPages = db_book.get(bookName).getPages();
        db_book.get(bookName).setPages(oldPages + extraPage);
        return "Extra Page updated successfully";
    }

    // GET - author who has written highest no of page

    public List<Author> authorOFHighestNoPage() {
        List<Author>  ansList = new ArrayList<>();
        for(Book book : db_book.values()) {
            int ansHighRating = 0;
            Author AnsAuthorName = null;
            String AuthorName = book.getAuthorName();
            for (Author author : db_Author.values()) {
                if (author.getAuthorName().equals(AuthorName) && author.getRating() > ansHighRating) {
                    ansHighRating = author.getRating();
                    AnsAuthorName = author;
                }
            }
            ansList.add(AnsAuthorName);
        }
        return ansList;
    }
}
