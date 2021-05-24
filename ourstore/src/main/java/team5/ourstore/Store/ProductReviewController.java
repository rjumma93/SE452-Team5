package team5.ourstore.Store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/reviews/")
public class ProductReviewController {
    @Autowired
    private ProductReviewRepository reviewRepository;

    public ProductReviewController(ProductReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("/all")
    public List<ProductReview> getAll() {
        return reviewRepository.findAll();
    }
}