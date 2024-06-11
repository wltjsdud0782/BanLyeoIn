package com.dangsya.BanLyeoIn.walk.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("walkService")
public class WalkServiceImpl implements WalkService{
    @Autowired
    private SqlSession sqlSession;
}
