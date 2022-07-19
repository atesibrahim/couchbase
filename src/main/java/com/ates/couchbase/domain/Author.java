package com.ates.couchbase.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.couchbase.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Author {

    @Field
    private String name;
}
