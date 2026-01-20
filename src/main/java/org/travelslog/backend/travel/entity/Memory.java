package org.travelslog.backend.travel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Memory {
    // travel FK
    // memory PK
    
    // title (nullable 가능, 제목이 없으면 본문 첫줄로)
    // content (text)  // 본문
    // happenedAt (nullable)  // 실제 시각(대략)
    // place (nullable)      // 실제 장소(대략)
    // createdAt / updatedAt
}
