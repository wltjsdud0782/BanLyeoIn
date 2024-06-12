package com.dangsya.BanLyeoIn.board.vo;

import lombok.Data;

@Data
public class PostReplyVO {
    private int replyNo;
    private String replyContent;
    private String replyWriter;
    private String replyDate;
    private int postNo;
}
