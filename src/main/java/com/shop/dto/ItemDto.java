package com.shop.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {
    /*
      데이터를 주고 받을 때는 Entity클래스 자체를 반환하지 않고
      데이터 전달용 객체를 생성해서 사용.
      1. 데이터베이스의 설계를 외부 노출하지 않음
      2. 요청과 응답 객체가 항상 엔티티와 같지 않음
     */
    private Long id;
    private String itemNm;
    private Integer price;
    private String itemDetail;
    private String sellStatCd;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

}
