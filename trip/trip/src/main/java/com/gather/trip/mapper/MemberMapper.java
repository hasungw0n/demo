package com.gather.trip.mapper;

import com.gather.trip.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void insert(MemberVO membervo);

    void delete(Long num);

    void update(Long num);

    MemberVO read(Long num);
}
