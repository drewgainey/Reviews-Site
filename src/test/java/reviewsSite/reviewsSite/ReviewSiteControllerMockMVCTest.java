package reviewsSite.reviewsSite;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static java.util.Arrays.asList;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewsSiteController.class)
public class ReviewSiteControllerMockMVCTest {
	
	@Resource
	private MockMvc mvc;
	
	@Mock
	private Review firstReview;
	
	@Mock
	private Review secondReview;
	
	@MockBean
	private ReviewRepository repo;
	
	@Test
	public void shouldBeOkForAllReviews() throws Exception {
		mvc.perform(get("/show-reviews")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldBeRoutedToAllReviewsView() throws Exception{
		mvc.perform(get("/show-reviews")).andExpect(view().name(is("reviews")));
	}
	
	@Test
	public void shouldPutAllReviewsIntoModel() throws Exception {
		Collection<Review> allReviews = asList(firstReview,secondReview);
		when(repo.findAll()).thenReturn(allReviews);
		mvc.perform(get("/show-reviews")).andExpect(model().attribute("reviews", is(allReviews)));
	}
	
	@Test
	public void shouldBeOkForOneReview() throws Exception {
		mvc.perform(get("/review?id=1")).andExpect(status().isOk());
	}
	@Test
	public void shouldBeRoutedToReviewView() throws Exception{
		mvc.perform(get("/review?id=1")).andExpect(view().name(is("review")));
	}
	@Test
	public void shouldPutSingleReviewIntoModel() throws Exception {
		when(repo.findReview(1L)).thenReturn(firstReview);
		mvc.perform(get("/review?id=1")).andExpect(model().attribute("reviews", is(firstReview)));
	}
}
