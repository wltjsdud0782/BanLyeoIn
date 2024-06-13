package com.dangsya.BanLyeoIn.walk.service;

import com.dangsya.BanLyeoIn.walk.vo.WalkVO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("walkService")
public class WalkServiceImpl implements WalkService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //산책 게시물 상세 조회
    @Override
    public WalkVO selectWalkDetail(int walkNum) {
        return sqlSession.selectOne("walkMapper.selectWalkDetail", walkNum);
    }



}
