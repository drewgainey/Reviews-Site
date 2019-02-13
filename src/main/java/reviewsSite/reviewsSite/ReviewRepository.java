package reviewsSite.reviewsSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review europe72 = new Review(1L,"Europe72","I know you rider", "Brown Eyed Woman", "Tennessee Jed", "Truckin", "Cumberland Blues" ,"/images/Grateful_Dead_-_Europe_'72.jpg");
		Review deadSet = new Review(2L,"Dead Set","Little Red Rooster", "Feel Like a Stranger", "Greatest Story Ever Told", "Samson and Deliah", "Friend of the Devil","/images/Grateful_Dead_-_Dead_Set.jpg");
		Review americanBeauty = new Review(3L, "American Beauty", "Box of Rain", "Ripple", "Brokedown Palace", "Operator", "Candyman","/images/Grateful_Dead_-_American_Beauty.jpg");
		
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
