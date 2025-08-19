package org.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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








}
