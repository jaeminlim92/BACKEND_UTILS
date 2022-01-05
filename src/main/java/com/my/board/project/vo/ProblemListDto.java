package com.my.board.project.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProblemListDto {
    private String problemId;
    private String problemNm;
    private String problemCntn;
    private String solveCntn;
    private String dataInputDttm;
    private String dataInputId;
    private String dataUpdDttm;
    private String dataUpdId;
}
