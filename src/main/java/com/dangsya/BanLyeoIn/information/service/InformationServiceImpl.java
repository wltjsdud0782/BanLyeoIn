package com.dangsya.BanLyeoIn.information.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("informationService")
public class InformationServiceImpl implements InformationService {
    @Autowired
    private SqlSession sqlSession;
}
