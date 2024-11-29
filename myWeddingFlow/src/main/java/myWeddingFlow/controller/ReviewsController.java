package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import myWeddingFlow.command.ReviewsCommand;
import myWeddingFlow.service.reviews.ReviewsListService;
import myWeddingFlow.service.reviews.ReviewsUpdateService;
import myWeddingFlow.service.reviews.ReviewsWriteService;
import myWeddingFlow.service.AutoNumService;
import myWeddingFlow.service.reviews.ReviewsDeleteService;
import myWeddingFlow.service.reviews.ReviewsDetailService;

@Controller
@RequestMapping("reviews")
public class ReviewsController {
	@Autowired
	ReviewsWriteService reviewsWriteService;
	@Autowired
	ReviewsListService reviewsListService;
	@Autowired
	ReviewsDetailService reviewsDetailService;
	@Autowired
	ReviewsUpdateService reviewsUpdateService;
	@Autowired
	ReviewsDeleteService reviewsDeleteService;
	@Autowired
	AutoNumService autoNumService;
	@GetMapping("reviewsWrite")
	public String reviewsWrite(ReviewsCommand reviewsCommand, Model model) {
		String autoNum=autoNumService.execute("review_","review_id",8,"reviewss");
		reviewsCommand.setReviewId(autoNum);
		model.addAttribute("reviewsCommand", reviewsCommand);
		return "thymeleaf/reviews/reviewsForm";
	}
	@PostMapping("reviewsRegist")
	public String reviewsRegist(ReviewsCommand reviewsCommand) {
		reviewsWriteService.execute(reviewsCommand);
		return "redirect:/";
	}
	@GetMapping("reviewsList")
	public String reviewsList(Model model) {
		reviewsListService.execute(model);
		return "thymeleaf/reviews/reviewsList";
	}
	@GetMapping("reviewsDetail")
	public String reviewsDetail(@RequestParam("reviewId") String reviewId, Model model) {
		reviewsDetailService.execute(reviewId, model);
		return "thymeleaf/reviews/reviewsInfo";
	}
	@GetMapping("reviewsUpdate")
	public String reviewsUpdate(@RequestParam("reviewId") String reviewId, Model model) {
		reviewsDetailService.execute(reviewId, model);
		return "thymeleaf/reviews/reviewsModify";
	}
	@PostMapping("reviewsModify")
	public String reviewsModify(ReviewsCommand reviewsCommand) {
		reviewsUpdateService.execute(reviewsCommand);
		return "redirect:reviewsDetail?reviewId="+reviewsCommand.getReviewId();
	}
	@GetMapping("reviewsDelete")
	public String reviewsDelete(@RequestParam("reviewId") String reviewId, Model model) {
		reviewsDeleteService.execute(reviewId);
		return "redirect:/";
	}
	
}
