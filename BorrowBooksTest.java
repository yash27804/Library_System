package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
class BorrowBooksTest {
    @Test
    public void check() {
        BorrowBooks b = new BorrowBooks();
        AddBooks a[] = new AddBooks[2];
        a[0] = new AddBooks();
        a[0].validateandadd("19441", "Hello 1", "World", "2024");
        a[1] = new AddBooks();
        a[1].validateandadd("19442", "Hello", "World", "2023");

        Assertions.assertThrows(NullPointerException.class, () ->
        {
            b.borrow(null);

        });
        Assertions.assertThrows(NullPointerException.class, () -> {
            b.borrow("Hello 2");
        });

        //Test Passed but as Exception Handled in BorrowBooks file it will throw error
        /*Assertions.assertThrows(NullPointerException.class,()->
        {
            b.returnbook(null);
        });*/

        //Test Passed and Exception Handled so now it won't throw error
        /*Assertions.assertThrows(NoSuchElementException.class,()->
        {
            b.returnbook("JALMANADA");
        });*/


    }

}
