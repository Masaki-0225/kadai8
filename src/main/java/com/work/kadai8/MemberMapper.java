package com.work.kadai8;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM members")
    List<Member> getAll();

}
