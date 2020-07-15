package com.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.basic.dao.memberDAO;
import com.basic.domain.memberVO;
@Service("service")

public class memberServiceImpl implements memberService {
	@Autowired
	private memberDAO member;
	
	@Override
	public int join(memberVO vo) {
		return member.join(vo);
	}

	@Override
	public List<memberVO> selectMember(memberVO vo) {
		System.out.println("여기 왔지? 2");
		return member.selectMember(vo);
	}

}  
