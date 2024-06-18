package com.dangsya.BanLyeoIn.member.vo;

import lombok.Data;

@Data
public class MemberVO {
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberTel;
    private String memberEmail;
    private String memberBirth;
    private String memberGender;
    private String memberAddr;
    private String addrDetail;
    private String regDate;
    private int memberRoll;
    private String postCode;
    private String memberNickname;
}
