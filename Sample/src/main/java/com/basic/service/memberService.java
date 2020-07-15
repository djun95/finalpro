package com.basic.service;

import java.util.List;

import com.basic.domain.memberVO;


public interface memberService {
	public int join(memberVO vo);
	
	public List<memberVO> selectMember(memberVO vo);
}
