package com.work.kadai8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/member")
    public String members(){
        return "member!!";
    }
}
