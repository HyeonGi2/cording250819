package org.apple.shop;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id; // public을 사용하면 모든 곳에서 사용가능 클래스 변수, 함수에. 안붙이면 같은폴더에서만 package-private (protected와 같다.)
    public String title; //private도 가능 다른 클래스에서 사용 불가 , static은 클래스,변수 사용가능

    // private를 사용하고싶다면 // System.out.pringln(a.getTitle()); < 컨트롤러에 넣기 getter 함수라고 칭함
//    public String getTitle() {
//        return title;
//    }
    //수정하고 싶을 시, setter 함수라고 칭함 @Getter. @Setter
//    public void setTitle(String title) {
//        this.title = title;
//    }
    // a.setTitle("abc"); << 컨트롤러


    //@Column(nullable = false) 세부 라이브러리는 사용할시 좀더 알아보고 사용하기
    public Integer price; //타입을 변경하고싶다면 ex) Long
//    public void setPrice(Integer price) {
    // 타입 변경 시 if문 추가)
//        this.price = price;
//    }   컨트롤러 a.setPrice(); 추가한 뒤, 위에 if문 로직추가


    //DB 데이터 입출력은 3단계
    //.findAll 쓰면 List에 담아서 가져온다.

//    public String toString() {
//        return this.title + this.price;
//    }  또는 어노테이션에 @ToString

}
