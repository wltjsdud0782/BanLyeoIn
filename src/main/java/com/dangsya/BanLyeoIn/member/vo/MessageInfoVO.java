package com.dangsya.BanLyeoIn.member.vo;

import lombok.Data;

@Data
public class MessageInfoVO {
    private int messageNum;
    private String toId;
    private String chatContent;
    private String fromId;
    private String messageRead;
    private String messageTime;
    private int chatNum;
}
