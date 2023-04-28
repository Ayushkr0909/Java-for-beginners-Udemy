package oops_again.object_composition;

public class BookReview {

	private int id;
	private String description;
	private int rating;

	public BookReview(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
    public String toString() {
    	return id + " " + description + " " + rating;
    }
}
