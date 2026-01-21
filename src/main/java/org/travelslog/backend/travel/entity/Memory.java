package org.travelslog.backend.travel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Memory {
    private final long id; // memory PK
    private final long travelId; // travel FK
    private final String title; // 제목
    private final String content; // 본문
    private final String happenedAt; // 실제 시각(대략)
    private final String place; // 실제 장소(대략)
    private final String createdAt; // 생성일시
    private final String updatedAt; // 수정일시
}
