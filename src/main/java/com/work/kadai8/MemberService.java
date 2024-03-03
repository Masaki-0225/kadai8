package com.work.kadai8;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private final MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<Member> findAll() {
        return memberMapper.getAll();
    }


    public Member findById(int id) {
        Optional<Member> member = this.memberMapper.findByMemberId(id);
        if (member.isPresent()) {
            return member.get();
        } else {
            throw new MemberNotFoundException("member not found");
        }
    }
}
