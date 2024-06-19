package com.dangsya.BanLyeoIn.member.service;

import com.dangsya.BanLyeoIn.member.vo.MemberVO;

public interface MemberService {

    int insertMemberInfo(MemberVO memberVO);

    MemberVO selectMeberInfo(MemberVO memberVO);

    int dupleChk(String memberId);
}
