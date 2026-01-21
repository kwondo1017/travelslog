package org.travelslog.backend.travel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Experience {
    private final long id; // 경험 PK
    private final long travelId; // memory PK
    private final String title; // 제목
    private final String locationNote; // 장소
    private final String activityNote; // 행동
    private final int dayIndex; // 여행 중 몇 번째 날인지, 1부터 시작
    private final TimeSlot timeSlot; // nullable : enum 데이터클래스
    private final int orderIndex; // 같은 dayIndex, timeSlot 내에서의 순서
    private final String createdAt;
    private final String updatedAt;
}
