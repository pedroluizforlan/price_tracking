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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String url;
    private String categoryId;

    private String store;
    private String imageUrl;
    @Builder.Default
    private Boolean active = true;
    private BigDecimal lastPrice;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
