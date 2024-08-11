package org.example;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BorrowBooks extends  AddBooks {
    ArrayList<BorrowBooks> bbooks = new ArrayList<>();

    BorrowBooks() {

    }

    BorrowBooks(String isbn_param, String title_param, String author_param, String publication_year_param) {
        this.isbn = isbn_param;
        this.publication_year = publication_year_param;
        this.title = title_param;
        this.author = author_param;
    }

    public void  borrow(String bname)
    {
        if(bname==null)
        {
            throw new NullPointerException("Name must be Given");
        }
        else if(bname.isBlank())
        {
            throw new NullPointerException("Name must be Given");
        }
    }

}