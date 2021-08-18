package com.goanna.quiz.repository;

import com.goanna.quiz.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeBookDatabase implements BookRepository{

    private static List<Book> bookData = new ArrayList<>();


    @Override
    public int insertBook(Book book) {
        bookData.add(new Book(book.getId(), book.getName()));
        return 1;
    }



    @Override
    public List<Book> getAllBooks() {
        return bookData;
    }



    @Override
    public Book SelectById(int id) {

        Book selected = null;

        for(Book book : bookData){
            if(book.getId() == id){
                selected = book;
            }
        }

        return selected;
    }
}