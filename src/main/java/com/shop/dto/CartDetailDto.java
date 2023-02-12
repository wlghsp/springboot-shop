package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDetailDto {

    private Long cartItemId;  // 장바구니 상품 아이디

    private String itemNm; // 상품명

    private int price; // 상품 금액

    private int count; // 수량

    private String imgUrl;  // 상품 이미지 경로

    public CartDetailDto(final Long cartItemId, final String itemNm, final int price, final int count, final String imgUrl) {
        this.cartItemId = cartItemId;
        this.itemNm = itemNm;
        this.price = price;
        this.count = count;
        this.imgUrl = imgUrl;
    }
}
