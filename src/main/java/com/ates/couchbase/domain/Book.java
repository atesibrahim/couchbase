package com.ates.couchbase.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Builder
@Data
@AllArgsConstructor
@Document
public class Book {

    @Id
    private final String id;

    @Field
    private String title;

    @Field
    private Author author;

    @Field
    private String[] tags;
}