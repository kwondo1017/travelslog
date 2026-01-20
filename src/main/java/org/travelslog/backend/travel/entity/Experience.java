package org.travelslog.backend.travel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Experience {
    // travel FK
    // 경험 PK

    // 제목
    // 장소 locationNote nullable
    // 행동 ActivityNote non-nullable

    // dayIndex (여행 중 몇 번째 날인지, 1부터 시작)
    // timeSlot (morning, afternoon, evening, night) nullable : enum 데이터클래스
    // orderLndex (같은 dayIndex, timeSlot 내에서의 순서)
}
