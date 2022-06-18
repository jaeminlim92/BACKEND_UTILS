package com.my.board.project.service.impl;

import com.my.board.project.service.ProblemService;
import com.my.board.project.util.ApiUtils;
import com.my.board.project.util.TrmCompare;
import com.my.board.project.vo.TrmListResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.my.board.project.vo.TrmListResDto.*;

@Slf4j
@Service
public class ProblemServiceImpl implements ProblemService {

    @Override
    public String getTest(){

        return "hello World";
    }

    @Override
    public TrmListResDto retrieveTrmMdlList(String searchDto){
        TrmListResDto trmListResDto = new TrmListResDto();

        TrmResDto trmResDto1 = TrmResDto.builder()
                                        .trmMdlCd("test1")
                                        .totalPrice(100)
                                        .urcBuyCnt(1)
                                        .build();

        trmListResDto.getPsblTrmList().add(trmResDto1);

        TrmResDto trmResDto2 = TrmResDto.builder()
                .trmMdlCd("test1")
                .totalPrice(200)
                .urcBuyCnt(1)
                .build();

        trmListResDto.getPsblTrmList().add(trmResDto2);

        TrmResDto trmResDto3 = TrmResDto.builder()
                .trmMdlCd("test1")
                .totalPrice(300)
                .urcBuyCnt(1)
                .build();

        trmListResDto.getPsblTrmList().add(trmResDto3);


        if("1".equals(searchDto)){
            TrmCompare.compareUrcBuyCnt(trmListResDto);
        }else if("2".equals(searchDto)){
            TrmCompare.comparePricePlan(trmListResDto);
        }

        return trmListResDto;
    }
}
