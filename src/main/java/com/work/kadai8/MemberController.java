package com.work.kadai8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member")
    public List<Member> getAll() {
        return memberService.findAll();
    }

    @GetMapping("/member/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.findById(id);
    }
}
