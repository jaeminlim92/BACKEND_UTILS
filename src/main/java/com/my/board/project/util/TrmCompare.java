package com.my.board.project.util;

import com.my.board.project.vo.TrmListResDto;

import java.util.Comparator;
import java.util.List;

import static com.my.board.project.vo.TrmListResDto.*;

/**
 * packageName    : com.my.board.project.util
 * fileName       : TrmCompare
 * author         : jaeminlim
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        jaeminlim       최초 생성
 */
public class TrmCompare {

    public static void compareUrcBuyCnt (TrmListResDto trmListResDto){

        List<TrmResDto> trmResDtoList= trmListResDto.getPsblTrmList();

        Comparator.comparing(TrmResDto::getTotalPrice);
    }

    public static void comparePricePlan(TrmListResDto trmListResDto){

        List<TrmResDto> trmResDtoList= trmListResDto.getPsblTrmList();

        Comparator.comparing(TrmResDto::getUrcBuyCnt);
    }
}
