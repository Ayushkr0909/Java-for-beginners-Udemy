package oops_again.object_composition;

import java.util.ArrayList;

public class Book {

	private int id;
	private String author;
	private String name;
	private ArrayList<BookReview> bookReviews = new ArrayList<>(); //bookReviews is stored as arrayList as one 
	                                                               //book can have multiple reviews

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(BookReview bookReview) {
		this.bookReviews.add(bookReview);     //addReview method adds the bookReview passed in to bookReviews		
	}
    public String toString() {
    	return String.format("id = %d name = %s author = %s bookReviews = [%s]", id,name,author,bookReviews);
    }
}
