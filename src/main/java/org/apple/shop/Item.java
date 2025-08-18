package org.apple.shop;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title; //private도 가능

    //@Column(nullable = false) 세부 라이브러리는 사용할시 좀더 알아보고 사용하기
    public Integer price;

    //DB 데이터 입출력은 3단계
    //.findAll 쓰면 List에 담아서 가져온다.

}
