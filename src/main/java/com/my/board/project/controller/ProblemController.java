package com.my.board.project.controller;

import com.my.board.project.service.ProblemService;
import com.my.board.project.vo.ProblemListDto;
import com.my.board.project.vo.SearchDto;
import com.my.board.project.vo.TrmListResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/problems")
public class ProblemController {

    private final ProblemService problemService;

    @Autowired
    public ProblemController(ProblemService problemService){
        this.problemService = problemService;
    }

    @GetMapping("/list:get")
    public TrmListResDto retriveProblemList(
            @RequestParam String searchDto){

        return problemService.retrieveTrmMdlList(searchDto);
    }

    @GetMapping("/test")
    public String test(){
        return "String";

    }

}
