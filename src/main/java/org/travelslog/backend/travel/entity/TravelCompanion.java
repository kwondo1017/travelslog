package org.travelslog.backend.travel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TravelCompanion {
    private final long id; // travelCompanion PK
    private final long travelId; // travel FK
    private final String name; // 동행인 이름
    private final String profileImageUrl; // 동행인 프로필 이미지 URL
    private final String note; // 동행인 메모
    private final String createdAt; // 생성일시
    private final String updatedAt; // 수정일시
}