package com.dangsya.BanLyeoIn.member.service;

import com.dangsya.BanLyeoIn.member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    SqlSessionTemplate sqlSession;


    @Override
    public int insertMemberInfo(MemberVO memberVO) {
        return sqlSession.insert("memberMapper.insertMemberInfo", memberVO);
    }

    @Override
    public MemberVO selectMeberInfo(MemberVO memberVO) {
        return sqlSession.selectOne("memberMapper.login", memberVO);
    }

    @Override
    public int dupleChk(String memberId) {
        return sqlSession.selectOne("memberMapper.dupleChk", memberId);
    }
}
