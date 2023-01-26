package org.example.controller;

import org.example.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/api-test")
    public String apiTest() {
        Member member = new Member();
        member.setAge(10);
        member.setName("콩순이");
        member.setMemo("★API★: Core에서 Member객체를 가져왔습니다.");
        return member.toString();
    }
}
