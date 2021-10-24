package com.trip.controller;

import com.trip.domain.BoardVO;
import com.trip.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")  //http://localhost:8181/myapp/board/main
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/insert")
    public String boardRegister(BoardVO boardvo){
        System.out.println(" C : insert!!!!!!!!!");
        boardService.boardRegister(boardvo);
        return "redirect:list";
    }



    // http://localhost:8181/main 으로 들어온걸
    // 살을 붙여서 전달한다
    // view:
    // prefix: /WEB-INF/views/
    // suffix: .jsp



}
