package org.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model) {
        var result = itemRepository.findAll(); //itemRepository.save();
        //List<Item> result = itemRepository.findAll();
        System.out.println(result);



        var a = new ArrayList<>();
        a.add(30);
        a.add(40);
        System.out.println(a);
        System.out.println(a.get(0));
        System.out.println(a.get(1));

        System.out.println(result.get(0)); //아이템에서 뽑은 오브젝트
        System.out.println(result.get(0).price);
        System.out.println(result.get(0).title);

        //ArrayList<Object> a = new ArrayList<>();

        model.addAttribute("name", "비싼 바지");
        return "list.html";


        //jpa로 데이터 입출력하기 1. 리포지터리만들기
    }
}
