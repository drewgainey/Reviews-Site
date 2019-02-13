package reviewsSite.reviewsSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review europe72 = new Review(1L,"Europe72","Europe 72");
		Review deadSet = new Review(2L,"DeadSet","DeadSet");
		Review americanBeauty = new Review(3L, "American Beauty", "American Beauty");
		
		reviewList.put(europe72.getId(), europe72);
		reviewList.put(deadSet.getId(), deadSet);
		reviewList.put(americanBeauty.getId(), americanBeauty);
	}
	
// Just for testing
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findReview(long reviewId) {
		return reviewList.get(reviewId);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
