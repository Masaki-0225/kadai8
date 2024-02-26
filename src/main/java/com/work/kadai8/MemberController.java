package com.work.kadai8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberMapper memberMapper;

    public MemberController(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    @GetMapping("/member")
    public List<Member> findById(@RequestParam int id) {
        return memberMapper.findByMemberId(id);
    }
}
