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
        int bresult=0;
        for(AddBooks a: abooks)
        {
            if(a.title.equalsIgnoreCase(bname))
            {
                bbooks.add(new BorrowBooks(a.isbn,a.title,a.author,a.author));
                bresult=1;
                System.out.println("Borrow Successful");
            }
            else
            {
                bresult=0;
            }

        }
        if(bresult==1)
        {
            abooks.removeIf(e->e.title.equalsIgnoreCase(bname));
        }
        else if (bresult==0)
        {

        }
    }

}