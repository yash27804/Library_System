package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class AddBooksTest {
@Test
    public void check()
    {
        ArrayList<AddBooks> addbooks=new ArrayList<>();
        System.out.println(addbooks.size());

        AddBooks a[];
        a=new AddBooks[2];

        AddBooks abooks=new AddBooks();

        //Test Case for NullPointerException Thrown it will fail as it has been catched

        Assertions.assertThrows(NullPointerException.class,()->
        {

            abooks.validateandadd(null,"Hello","World","Again");

        });
        //Test Case for ISBN Length
        AddBooks abooks1=new AddBooks("1899","HELLO","WORLD","AGAIN");
        AddBooks abooks2=new AddBooks("189989","HELLO","WORLD","AGAIN");
        AddBooks abooks3=new AddBooks("18994","HELLO","WORLD","AGAIN");

        //Test Case for ISBN Unique
        for(int i=0;i<2;i++)
        {
            a[i]=new AddBooks();
            a[i].validateandadd("18994","HELLO","WORLD","AGAIN");
        }

        //Test Case if no Books available
        abooks1.validateandadd("19005", "Hello", "World", "Again");
        AddBooks.abooks.clear();
        Assertions.assertThrows(NoSuchElementException.class,()->
        {
            abooks.getAllBooks();
        });








    }

}