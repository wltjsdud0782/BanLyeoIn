package com.dangsya.BanLyeoIn.board.vo;

import lombok.Data;

@Data
public class PostAttachmentVO {
    private int attachmentCode;
    private String originFileName;
    private String attachedFileName;
    private String isMain;
    private int postNo;
}
