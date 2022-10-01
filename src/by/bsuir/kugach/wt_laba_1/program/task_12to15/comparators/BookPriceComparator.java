package by.bsuir.kugach.wt_laba_1.program.task_12to15.comparators;

import by.bsuir.kugach.wt_laba_1.program.task_12to15.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book_1, Book book_2){
        return Integer.compare(book_1.getPrice(), book_2.getPrice());
    }
}
