package com.dangsya.BanLyeoIn.board.vo;

import lombok.Data;

@Data
public class BoardPostVO {
    private int postNo;
    private String postTitle;
    private String postContent;
    private String writer;
    private String createDate;
    private int readCnt;
    private int likeCnt;
    private int categoryNo;
}
