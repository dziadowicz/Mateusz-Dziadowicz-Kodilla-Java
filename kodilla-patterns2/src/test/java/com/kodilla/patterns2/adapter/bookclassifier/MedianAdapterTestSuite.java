package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        Set<Book> bookSet = new HashSet<>();

        //Given
        Book book = new Book("J.R.R. Tolkien", "Hobbit", 1972, "123");
        Book book1 = new Book("J.R.R. Tolkien", "Lord of The Rings", 1977, "124");
        Book book2 = new Book("G. Orwell", "1984", 1952, "125");
        bookSet.add(book);
        bookSet.add(book1);
        bookSet.add(book2);

        MedianAdapter medianAdapter = new MedianAdapter();

        //when
        int median = medianAdapter.publicationYearMedian(bookSet);

        //then
        assertEquals(1972, median);
    }
}
