package com.dangsya.BanLyeoIn.walk.vo;

import com.dangsya.BanLyeoIn.place.vo.PlaceVO;
import lombok.Data;

@Data
public class WalkVO {
    //산책 게시물
    private int walkNum;
    private String walkTitle;
    private String walkContent;
    private String writer;
    private String createDate;
    private int readCnt;
    private int recType;

    //산책 장소 정보
    private int placeNum;
    private PlaceVO placeVO;
}
