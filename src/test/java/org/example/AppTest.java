package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.entity.Book;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public AppTest(  ) {

        Book book = new Book("Булгаков А М","Мастер и Маргарита",1190.20,1990, "Классика " );
        Book book2 = new Book("Булгаков А М","Мастер и Маргарита",1190.20,1990, "Классика ");

       // Book book3 = new Book("Булгаков");
        System.out.println(book.equals(book2));
        System.out.println(book);



    }


    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testApp()
    {
        assertTrue( true );
    }
}
