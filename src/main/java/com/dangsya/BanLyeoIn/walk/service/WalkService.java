package com.dangsya.BanLyeoIn.walk.service;

import com.dangsya.BanLyeoIn.walk.vo.WalkVO;

public interface WalkService {

    //산책 게시글 상세 조회
    WalkVO selectWalkDetail(int walkNum);


}
