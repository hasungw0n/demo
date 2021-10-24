package com.trip.service;

import com.trip.domain.BoardVO;
import com.trip.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor  // lombok어노테이션 getter setter 자동 생성자
public class BoardServiceImpl implements BoardService {
    private final BoardMapper boardMapper;

    @Override
    public void boardRegister(BoardVO boardvo) {
        boardMapper.insert(boardvo);
    }

}

