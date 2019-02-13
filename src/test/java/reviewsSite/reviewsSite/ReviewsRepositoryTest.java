package reviewsSite.reviewsSite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

public class ReviewsRepositoryTest {

	private long reviewId = 1L;
	private Review review = new Review(reviewId, "review name", "review description");

	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "review name", "review description");

	ReviewRepository underTest = new ReviewRepository(review, secondReview);

	@Test
	public void shouldBeAbleToFindReview() {
		Review result = underTest.findReview(reviewId);
		assertThat(result, is(review));
	}

	@Test
	public void shouldBeAbleToFindAllReviews() {
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(review, secondReview));

	}

}
