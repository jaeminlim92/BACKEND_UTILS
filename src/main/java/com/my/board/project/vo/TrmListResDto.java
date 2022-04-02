package com.my.board.project.vo;

import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * packageName    : com.my.board.project.vo
 * fileName       : TrmListResDto
 * author         : jaeminlim
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        jaeminlim       최초 생성
 */
@Setter
@Getter
@ToString
public class TrmListResDto{

    private List<TrmResDto> psblTrmList;

    private List<TrmResDto> ipsbTrmList;

    public TrmListResDto() {
        this.psblTrmList = new ArrayList<TrmResDto>();
        this.ipsbTrmList = new ArrayList<TrmResDto>();
    }

    @Getter
    @ToString
    @NoArgsConstructor
    public static class TrmResDto{

        private String trmMdlCd;

        private Integer urcBuyCnt;

        private Integer totalPrice;

        @Builder
        public TrmResDto(String trmMdlCd, Integer urcBuyCnt, Integer totalPrice) {
            this.trmMdlCd = trmMdlCd;
            this.urcBuyCnt = urcBuyCnt;
            this.totalPrice = totalPrice;
        }

    }




}
