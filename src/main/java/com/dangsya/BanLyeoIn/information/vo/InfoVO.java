package com.dangsya.BanLyeoIn.information.vo;

import lombok.Data;

@Data
public class InfoVO {
    private int infoNum;
    private String infoTitle;
    private String infoContent;
    private String writer;
    private String createDate;
    private int readCnt;
    private int infoType;
}
