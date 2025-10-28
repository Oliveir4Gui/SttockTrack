package com.stocktrack.com.stocktrack;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "brapi", url = "https://brapi.dev")
public interface BrapiClient {

    // Ex.: GET https://brapi.dev/api/quote/PETR4?token=SEU_TOKEN
    @GetMapping("/api/quote/{tickers}")
    QuoteResponse getStockQuote(
            @PathVariable("tickers") String tickers,
            @RequestParam("token") String token
    );
}