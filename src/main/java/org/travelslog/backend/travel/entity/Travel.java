package org.travelslog.backend.travel.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Travel {
    private final long id; // travel PK
    private final long userId; // 유저 FK
    private final String title;
    private final String note;
    private final String countryCode; // ISO 3166-1 alpha-2 not-null 길이고정(2자리)
    private final String cityCode;    // ISO 3166-2 numeric 
    private final TravelCompanion companion; // 동행인
    private final LocalDate startDate;
    private final LocalDate endDate;
    // LocalDate StartDate / EndDate
    
    private final TravelStatus status; // 여행 상태 PLAN, ARCHIVED
    private final String createdAt;
    private final String updatedAt;
}
