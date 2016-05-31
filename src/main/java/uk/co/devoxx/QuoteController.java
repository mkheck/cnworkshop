package uk.co.devoxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markheckler on 5/30/16.
 */
@RestController
public class QuoteController {
    @Autowired
    QuoteRepository quoteRepository;

    @RequestMapping("/random")
    public Quote getRandomQuote() {
        return quoteRepository.getQuotesRandomOrder().get(0);
    }
}
