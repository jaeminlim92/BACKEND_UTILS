package com.my.board.project.service;

import com.my.board.project.vo.SearchDto;
import com.my.board.project.vo.TrmListResDto;

public interface ProblemService {

    public String getTest();

    public TrmListResDto retrieveTrmMdlList(String searchDto);
}
