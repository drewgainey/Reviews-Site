package reviewsSite.reviewsSite;

public class Review {

	private long reviewId;
	private String reviewName;
	private String song1;
	private String song2;
	private String song3;
	private String song4;
	private String song5;
	private String image;

	public Review(long reviewId, String reviewName, String song1, String song2, String song3, String song4, String song5, String image) {
		this.reviewId = reviewId;
		this.reviewName = reviewName;
		this.song1 = song1;
		this.song2 = song2;
		this.song3 = song3;
		this.song4 = song4;
		this.song5 = song5;
		this.image = image;
	}

	public Long getId() {
		return reviewId;
	}
	
	public String getReviewName() {
		return reviewName;
	}
	public String getSong1() {
		return song1;
	}
	public String getSong2() {
		return song2;
	}
	public String getSong3() {
		return song3;
	}
	public String getSong4() {
		return song4;
	}
	public String getSong5() {
		return song5;
	}
	public String getImage() {
		return image;
	}

}
