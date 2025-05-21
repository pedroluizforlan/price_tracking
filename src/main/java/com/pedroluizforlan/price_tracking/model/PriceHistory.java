package com.pedroluizforlan.price_tracking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "price_history")
public class PriceHistory {
    @Id
    private String id;
    private String productId;
    private BigDecimal price;
    private LocalDateTime collectedAt;

    private String currency;
    private String rawHtml;
    private Boolean successful;
    private String errorMessage;
}
