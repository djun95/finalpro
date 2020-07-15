package com.basic.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.basic.domain.memberVO;
import com.basic.service.memberService;

@Controller
public class memberController {
	@Autowired
	private memberService service;
	
	@RequestMapping("/join.do")
	public ModelAndView join(memberVO vo) {
		int result = service.join(vo);
		String message = "가입 실패"; 
		if(result == 1) {
			message = vo.getName() + "님 가입 축하드립니다";
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/memberselect.do")
	public void memberselect(memberVO vo, Model model) {
		System.out.println("여기 왔지 1?");
		model.addAttribute("list", service.selectMember(vo));
	}
}
