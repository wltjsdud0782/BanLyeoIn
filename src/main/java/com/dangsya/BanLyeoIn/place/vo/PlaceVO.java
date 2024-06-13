package com.dangsya.BanLyeoIn.place.vo;

import lombok.Data;

@Data
public class PlaceVO {
    private int placeNum;
    private String placeName;
    private double latitude; //위도
    private double longitude; //경도
    private String address;
}

