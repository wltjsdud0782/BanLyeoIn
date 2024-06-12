package com.dangsya.BanLyeoIn.recommend.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("recommendService")
public class RecommendServiceImpl implements RecommendService {
    @Autowired
    private SqlSession sqlSession;
}
