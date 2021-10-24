package com.gather.trip.service;

import com.gather.trip.domain.MemberVO;

public interface MemberService {


    void register(MemberVO memberVO);

    void deleteMember(Long num);

    void updateMember(Long num);

    MemberVO getMember(Long num);
}
