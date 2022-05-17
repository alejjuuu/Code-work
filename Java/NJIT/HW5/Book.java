package NJIT.HW5;

import java.util.Objects;

public class Book {
    private int pages;
    private String publisher;

    // constructor
    public Book(int numPages, String namePublisher) {
        this.pages = numPages;
        this.publisher = namePublisher;
    }

    // getter for pages
    public int getPages() {
        return pages;
    }

    // getter for publisher
    public String getPublisher() {
        return publisher;
    }

    // setter for pages
    public void setPages(int numPages) {
        this.pages = numPages;
    }

    // setter for publisher
    public void setPublisher(String namePublisher) {
        this.publisher = namePublisher;
    }

    // toString Method
    public String toString() {
        return ("The publisher: " + publisher + " has: " + pages + " pages, and it's the biggest!.");
    }

    public boolean equals(Book object1) {
        // this could've been done with a simple return statement
        return ((object1.getPages() == pages)
                && publisher.equals(object1.getPublisher()));
    }

    public int compareTo(Book object1) {
        int value = 0;
        if (pages < object1.getPages())
            value = -1;
        else if (pages > object1.getPages())
            value = 1;
        else if (pages == object1.getPages())
            value = 0;
        return value;
    }
}
