package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/myInfo")
	public String myInfo(Model model) {
		model.addAttribute("name", "홍길동");
		System.out.println("테스트");
		return "member/myInfo";
	}
}
