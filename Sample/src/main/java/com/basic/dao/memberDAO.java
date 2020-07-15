package com.basic.dao;

import java.util.List;

import com.basic.domain.memberVO;

public interface memberDAO {
	
	public int join(memberVO vo);
	
	public List<memberVO> selectMember(memberVO vo);
}
