package com.stocktrack.com.stocktrack;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/stock")
public class BrapiController {

    private final BrapiClient brapiClient;

    @Value("${brapi.token}")
    private String token;

    @GetMapping("/{ticker}")
    public QuoteResponse getStock(@PathVariable String ticker) {
        return brapiClient.getStockQuote(ticker, token);
    }
}
