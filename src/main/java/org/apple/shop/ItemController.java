package org.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model) {
        List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);
        var a = new Item();  // Item.java 에 toString 부분
        System.out.println(a.toString());  // Item.java 에 toString 부분 오브젝트 한눈에 보기
        return "list.html";


//        var result = itemRepository.findAll(); //itemRepository.save();
//        //List<Item> result = itemRepository.findAll();
//        System.out.println(result);
//
//
//
//        var a = new ArrayList<>();
//        a.add(30);
//        a.add(40);
//        System.out.println(a);
//        System.out.println(a.get(0));
//        System.out.println(a.get(1));
//
//        System.out.println(result.get(0)); //아이템에서 뽑은 오브젝트
//        System.out.println(result.get(0).price);
//        System.out.println(result.get(0).title);

        //ArrayList<Object> a = new ArrayList<>();


        //jpa로 데이터 입출력하기 1. 리포지터리만들기
    }

    @GetMapping("/write")
    String write() {
        return "write.html";
    }

//    @PostMapping("/add") // add 는 명사로 변경하면 좋다
//    String addPost(@RequestParam String title,@RequestParam String price) {
//        System.out.println(title);
//        System.out.println(price);
//        return "redirect:/list";  //전송 누르면 서버로 데이터 전송
//    }

    // 서버 이상없을시 db에 저장하기
    @PostMapping("/add")
    String addPost(String title, Integer price) {

        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);
        itemRepository.save(item);
        System.out.println(item);



        return "redirect:/list";
    }

// 서버 이상 없을시 db에 저장하기2
//    @PostMapping("/add")
//    String addPost(@ModelAttribute Item item) {
//        System.out.println(item);
//        itemRepository.save(item);
//        return "redirect:/list";
//    }


    // 이런식으로 상품개수가 100개라면 100개 제작할 필요 x url 파라미터 문법사용하기
//    @PostMapping("/detail/1")
//    String addPost() {
//
//        return "redirect:/list";
//    }

//    @PostMapping("/detail/2")
//    String addPost() {
//
//        return "redirect:/list";
//    }

//                        url 파라미터 여러개 사용가능 작명 원하는단어로
  /*
    @GetMapping("/detail/{id}")
    String detail() {
//        var  result = itemRepository.findById(1L);
        Optional<Item> result = itemRepository.findById(1L);
        if (result.isPresent()) {
//        result.get(); result가 비어있다면 오류 발생 if문 사용
            System.out.println(result.get());
            // Optional 사용이유는 100번째 데이터가 없을경우 대비
        }
            return "detail.html";
        }
        */

    // detail/1 또는 2에 접속하면 그에 맞는 아이디값 데이터 가져오기
    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id, Model model) throws Exception {
        throw new Exception();
    }

//        ResponseEntity<String> detail(@PathVariable Long id, Model model) {

//            Optional<Item> result = itemRepository.findById(id);
//            if (result.isPresent()) {
//
//                model.addAttribute("data", result.get());
//                return "detail.html";
//            } else {
//                return "redirect:/list";
//
//            }
//
//        }
//            return "redirect:/list";
//            return ResponseEntity.status(400).body("에러");
        //유저 오류 4XX 서버 오류 5XX 정상 200 http status code 가이드 참조
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("에러");


//      모든 api에서 Exception 발생 시 코드 실행
//        @ExceptionHandler(Exception.class)
//        public void handler() {
//        return ResponseEntity.status().body();

//       번거로우면 파일로 직접 따로생성




}

