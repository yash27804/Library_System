package  org.example;

import java.util.ArrayList;

class AddBooks
{
    protected String isbn, title, author, publication_year;
    protected static ArrayList<AddBooks> abooks = new ArrayList<>();
    public static int count=0;

    AddBooks()
    {

    }
    AddBooks(String isbn_param, String title_param, String author_param, String publication_year_param)
    {
        throwNullPointerException(isbn_param, title_param, author_param, publication_year_param);
        checkISBNLength(isbn_param);
        checkISBN(isbn_param);
        this.isbn = isbn_param;
        this.author = author_param;
        this.title = title_param;
        this.publication_year = publication_year_param;
    }
    public void preaddedbooks()
    {
        abooks.add(new AddBooks("17890","The Jungle Book","B.K JADEJA","JK PUBLICATION"));
        abooks.add(new AddBooks("17891","The Race in the Wild","JIGAR SHAH","JK PUBLICATION"));
        abooks.add(new AddBooks("17892","Bharat Itihaas","PRAVEEN PATEL","NANDI PUBLICATION"));
        abooks.add(new AddBooks("17893","MAHABHARATA","MATHUR K","ALB PUBLICATION"));
        abooks.add(new AddBooks("17894","RAMAYANA","JAGAL SHRINATH","ALB PUBLICATION"));
    }

    public void throwNullPointerException(String isbn,String title,String author,String publication_year)
    {

        if (isbn==null || title==null || author==null || publication_year==null)
        {
            throw new NullPointerException("Values cannot be blank");
        }
        else if (isbn.isBlank() || title.isBlank() || author.isBlank() || publication_year.isBlank())
        {
            throw new NullPointerException("Values cannot be blank");
        }

    }
    public void validateandadd(String isbn_param,String title_param,String author_param,String publication_year_param)
    {

        abooks.add(new AddBooks(isbn_param,title_param,author_param,publication_year_param));
    }
    public void checkISBNLength(String isbn_param)

    {
        try {
            if (isbn_param.length() < 5 || isbn_param.length() > 5) {
                throw new RuntimeException("Length must be of 5 ");
            }
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void checkISBN(String isbn_param)
    {

        for(AddBooks a:abooks)
        {
            try {
                if (a.isbn.equalsIgnoreCase(isbn_param)) {
                    throw new RuntimeException("ISBN ALREADY EXISTS -> ISBN MUST BE UNIQUE");

                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }



    }
}