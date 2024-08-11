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
                break;
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
            throw new NullPointerException("Not Available") ;
        }
    }
    public void returnbook(String rbname)
    {

        if(rbname==null)
        {
            throw new NullPointerException("BookName cannot be null");
        }
        else if(rbname.isBlank())
        {
            throw new NullPointerException("BookName cannot be null");
        }

        int rresult=0;
        for(BorrowBooks b:bbooks)
        {
            if(b.title.equalsIgnoreCase(rbname))
            {
                abooks.add(new BorrowBooks(b.isbn,b.title,b.author,b.author));
                rresult=1;
            }
            else
            {
                rresult=0;
            }

        }
        if(rresult==1)
        {
            bbooks.removeIf(e->e.title.equalsIgnoreCase(rbname));
            System.out.println("Return Successful");
        } else if (rresult==0)
        {
            try {
                throw new NoSuchElementException("BOOK NOT FOUND");
            }
            catch(NoSuchElementException e)
            {
                System.out.println(e.getMessage());
            }
        }

    }


}

