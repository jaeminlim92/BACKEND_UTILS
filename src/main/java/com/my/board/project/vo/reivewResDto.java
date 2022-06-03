package com.my.board.project.vo;

import lombok.*;

/**
 * packageName    : com.my.board.project.vo
 * fileName       : reivewResDto
 * author         : jaeminlim
 * date           : 2022/05/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/15        jaeminlim       최초 생성
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class reivewResDto {
    private String seq;
    private String productId;
    private String content;
    private String createAt;

    @Builder
    public reivewResDto(String seq, String productId, String content, String createAt) {
        this.seq = seq;
        this.productId = productId;
        this.content = content;
        this.createAt = createAt;
    }
}
