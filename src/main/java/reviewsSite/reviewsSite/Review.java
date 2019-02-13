package reviewsSite.reviewsSite;

public class Review {

	private long reviewId;
	private String reviewName;
	private String reviewDescription;

	public Review(long reviewId, String reviewName, String reviewDescription) {
		this.reviewId = reviewId;
		this.reviewName = reviewName;
		this.reviewDescription = reviewDescription;
	}

	public Long getId() {
		return reviewId;
	}
	
	public String getReviewName() {
		return reviewName;
	}
	public String getReviewDescription() {
		return reviewDescription;
	}

}
