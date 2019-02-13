package reviewsSite.reviewsSite;

public class Review {

	private long reviewId;
	private String reviewName;
	private String reviewDescription;
	private String image;

	public Review(long reviewId, String reviewName, String reviewDescription, String image) {
		this.reviewId = reviewId;
		this.reviewName = reviewName;
		this.reviewDescription = reviewDescription;
		this.image = image;
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
	public String getImage() {
		return image;
	}

}
