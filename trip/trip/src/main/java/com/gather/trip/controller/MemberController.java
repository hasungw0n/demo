package com.gather.trip.controller;

import com.gather.trip.domain.MemberVO;
import com.gather.trip.service.MemberService;
import lombok.RequiredArgsConstructor;

import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members") // REST API URI 네이밍 규칙 -> VO명의 복수로 네이밍
@RequiredArgsConstructor
public class MemberController { //JSON 형식으로 데이터를 주고받음

    // http://loclahost:8080/items/식별자

    private final MemberService memberService;

    // POST, GET, PUT, DELETE

    // POST -> 새로 만들때 사용 (CREATE)
    @PostMapping // POST http://localhost:8080/members
    public String register(@RequestBody MemberVO memberVO){
        memberService.register(memberVO);
        return "멤버 등록 완료";
    }

    // Get
    // http://localhost:8080/members?num=1 -> QueryParameter


    @DeleteMapping("/{num}")
    public String deleteMember(@PathVariable Long num){
        memberService.deleteMember(num);
        return "삭제완료";
    }

    // update
    @PutMapping("/{num}")
    public String updateMember(@PathVariable Long num){
        memberService.updateMember(num);
        return "민재 바보";
    }

    @GetMapping("/{num}")
    // 접근지정자(pubilc) 리턴타입(MemberVO, String, int) 메소드명(){}
    public MemberVO readMember(@PathVariable Long num){
        MemberVO result = memberService.getMember(num);
        return result;
    }

}


