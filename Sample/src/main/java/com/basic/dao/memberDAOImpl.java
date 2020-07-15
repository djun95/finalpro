package com.basic.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.basic.domain.memberVO;

@Repository("member")
public class memberDAOImpl implements memberDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	@Override
	public int join(memberVO vo) {
		return mybatis.insert("memberDAO.insertMember",vo);
	}
	@Override
	public List<memberVO> selectMember(memberVO vo) {
		System.out.println("여기왔지?3");
		return mybatis.selectList("memberDAO.memberSelect",vo);
	}
	
}
