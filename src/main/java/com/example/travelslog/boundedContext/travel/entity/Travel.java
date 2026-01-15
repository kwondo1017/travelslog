package com.example.travelslog.boundedContext.travel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Travel {
    private static int lastId = 0;
    private final long id;
    private final String title;
    private final String description;
    private final String countryCode; // ISO 3166-1 alpha-2
    private final byte cityCode;    // ISO 3166-2 numeric
    //유저 FK



    public Travel(String title, String description) {
        this(++lastId, title, description, null, (byte)0);
    }
}

