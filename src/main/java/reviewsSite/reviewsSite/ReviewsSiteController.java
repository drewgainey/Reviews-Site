package reviewsSite.reviewsSite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsSiteController {
	
	@Resource
	ReviewRepository reviewRepo;
	
	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews",reviewRepo.findAll());
		return "reviews";	
	}
	
	@RequestMapping("review")
	public String findOneReview(@RequestParam(value="id") long reviewId, Model model) {
		model.addAttribute("reviews", reviewRepo.findReview(reviewId));
		return "review";
	}

}
