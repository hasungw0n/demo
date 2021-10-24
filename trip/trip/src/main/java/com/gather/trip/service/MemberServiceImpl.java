package com.gather.trip.service;

import com.gather.trip.domain.MemberVO;
import com.gather.trip.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public void register(MemberVO memberVO) {
        memberMapper.insert(memberVO);
    }

    @Override
    public void deleteMember(Long num) {
        memberMapper.delete(num);
    }

    @Override
    public void updateMember(Long num) {
        memberMapper.update(num);
    }

    @Override
    public MemberVO getMember(Long num) {
        MemberVO result = memberMapper.read(num);
        return result;
    }


}
