package com.my.board.project.controller;

import com.my.board.project.service.ProblemService;
import com.my.board.project.vo.ProblemListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/problems")
public class ProblemController {

    private final ProblemService problemService;

    @Autowired
    public ProblemController(ProblemService problemService){
        this.problemService = problemService;
    }

    /**
     * Retrive problem list list.
     *
     * @return the list
     */
    @GetMapping("/list")
    public List<ProblemListDto> retriveProblemList(){


        return null;
    }


}
