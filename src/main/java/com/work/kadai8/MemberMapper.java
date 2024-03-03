package com.work.kadai8;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;


@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM members")
    List<Member> getAll();

    @Select("SELECT * FROM members WHERE id = #{id}")
    Optional<Member> findByMemberId(int id);

}
