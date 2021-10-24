package com.trip.mapper;

import com.trip.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {


    void insert(BoardVO boardvo);


}
