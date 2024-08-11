package  org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class Library {
    public static void main(String args[]) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        AddBooks addbook = new AddBooks();
        BorrowBooks borrowbook = new BorrowBooks();
        addbook.preaddedbooks();
        try {
            while (ch != 5) {
                System.out.println("1.Add Book");
                System.out.println("2.Borrow Book");
                System.out.println("3.Return Book");
                System.out.println("4.Display All Books");
                System.out.println("5.Exit");
                System.out.println("Enter choice from above");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        char choice = 'y';
                        do {
                            System.out.println("Enter ISBN of Book:");
                            String isbn = sc.next();
                            System.out.println("Enter Title of Book:");
                            String name = sc.next();
                            System.out.println("Enter Author of Book:");
                            String author = sc.next();
                            System.out.println("Enter Publishor of Book:");
                            String publication = sc.next();
                            addbook.validateandadd(isbn, name, author, publication);
                            System.out.println("Do you want to enter Again:");
                            choice = sc.next().charAt(0);
                        } while (choice == 'y' || choice == 'Y');
                        break;
                    case 2:
                        System.out.println("Enter book name to borrow");
                        String bname=sc.next();
                        borrowbook.borrow(bname);
                        break;
                    case 3:
                        System.out.println("Enter return book name:");
                        String rbname=sc.next();
                        borrowbook.returnbook(rbname);
                        break;
                    case 4:
                        System.out.println("Display all BOOKS");
                        addbook.getAllBooks();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }


            }

        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }
}