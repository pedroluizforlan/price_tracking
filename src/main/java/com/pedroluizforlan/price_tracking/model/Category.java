package com.pedroluizforlan.price_tracking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "categories")
public class Category {
    @Id
    private String id;
    private String name;
    private String description;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
