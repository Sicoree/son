package com.d202.assemble.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SignMacroResponseDto {
    private Long seq;
    private String title;
    private String content;
    private String signSrc;
    private String icon;
    private Category categorySeq;
    private Long count;

    public SignMacroResponseDto(SignMacro entity) {
        this.seq = entity.getSeq();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.signSrc = entity.getSignScr();
        this.icon = entity.getIcon();
        this.categorySeq = entity.getCategory();
        this.count = entity.getCount();
    }
}
