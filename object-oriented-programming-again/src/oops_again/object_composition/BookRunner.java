package oops_again.object_composition;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOPS", "Ayush");
		book.addReview(new BookReview(10, "Great Book", 5));
		book.addReview(new BookReview(20, "OK", 3));
		
		System.out.println(book);

	}

}
