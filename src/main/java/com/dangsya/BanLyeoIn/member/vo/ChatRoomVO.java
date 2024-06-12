package com.dangsya.BanLyeoIn.member.vo;

import lombok.Data;

@Data
public class ChatRoomVO {
    private int chatNum;
    private String chatTitle;
    private String fromId;
    private String toId;
    private String chatTime;

}
