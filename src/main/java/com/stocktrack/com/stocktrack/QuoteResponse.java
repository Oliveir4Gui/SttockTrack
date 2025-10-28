package com.stocktrack.com.stocktrack;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponse {
    private List<Quote> results;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Quote {
        private String symbol;
        private String shortName;
        private Double regularMarketPrice;
        private Double regularMarketChangePercent;
    }
}