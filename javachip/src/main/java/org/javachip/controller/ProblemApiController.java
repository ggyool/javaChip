package org.javachip.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.javachip.domain.MultipleChoiceVO;
import org.javachip.domain.ProblemVO;
import org.javachip.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path="/problem")
public class ProblemApiController {
	
	@Autowired 
	ProblemService problemService;
	
	/*
	 * @PostMapping(path="/problem/multiplechoice") public ModelAndView
	 * multipleProblemPost(HttpServletResponse response,
	 * 
	 * @RequestBody ProblemVO problem_vo , @RequestBody MultipleChoiceVO
	 * multipleChoice_vo) throws IOException{ ModelAndView mav = new ModelAndView();
	 * // �Խ������� redirect �ؾ��Ѵ�. //mav.setViewName("redirect:/problem");
	 * //mav.addObject("something","new"); // �α��� �۾� ���� �����ؾ��Ѵ�.
	 * //vo.setUser_id("user00"); //vo.setUser_name("����00");
	 * //mav.addObject("sucess", problemService.register(vo) ? true : false);
	 * problem_vo = problemService.register(problem_vo, multipleChoice_vo);
	 * PrintWriter out = response.getWriter(); out.print(""); out.close(); return
	 * mav; }
	 */
}