package org.example.controller;


import org.example.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchController {

    @GetMapping("/batch-test")
    public String batchTest() {
        Member member = new Member();
        member.setAge(10);
        member.setName("둘리");
        member.setMemo("★Batch★: Core에서 Member객체를 가져왔습니다.");
        return member.toString();
    }

}
