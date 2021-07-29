package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CustomerTest
{
    @Test
    public void should_get_right_rental_statement_for_childrens_and_days_less_than_3()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill", 2);
        customer.addRental(new Rental(movie, 2));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_childrens_and_days_equal_3()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill", 2);
        customer.addRental(new Rental(movie, 3));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_childrens_and_days_more_than_3()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill", 2);
        customer.addRental(new Rental(movie, 5));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill\t4.5\n" +
                "Amount owed is 4.5\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_regualar_and_days_less_than_2()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill2", 0);
        customer.addRental(new Rental(movie, 1));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill2\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_regualar_and_days_equal_2()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill2", 0);
        customer.addRental(new Rental(movie, 1));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill2\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_regualar_and_days_more_than_2()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill2", 0);
        customer.addRental(new Rental(movie, 5));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill2\t6.5\n" +
                "Amount owed is 6.5\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_new_release_and_retal_days_equal_1()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill3", 1);
        customer.addRental(new Rental(movie, 1));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill3\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_new_release_and_retal_days_more_than_1()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill3", 1);
        customer.addRental(new Rental(movie, 5));
        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill3\t15.0\n" +
                "Amount owed is 15.0\n" +
                "You earned 2 frequent renter points", customer.statement());
    }

    @Test
    public void should_get_right_rental_statement_for_all_type()
    {
        Customer customer = new Customer("Wonder");

        Movie movie = new Movie("Kill Bill", 2);
        Movie movie2 = new Movie("Kill Bill2", 0);
        Movie movie3 = new Movie("Kill Bill3", 1);
        customer.addRental(new Rental(movie, 5));
        customer.addRental(new Rental(movie2, 4));
        customer.addRental(new Rental(movie3, 3));

        assertEquals("Rental Record for Wonder\n" +
                "\tKill Bill\t4.5\n" +
                "\tKill Bill2\t5.0\n" +
                "\tKill Bill3\t9.0\n" +
                "Amount owed is 18.5\n" +
                "You earned 4 frequent renter points", customer.statement());
    }
}
