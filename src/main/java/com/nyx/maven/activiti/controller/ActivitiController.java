package com.nyx.maven.activiti.controller;

import javax.annotation.Resource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nyx.maven.activiti.util.ActivitiUtil;

@Controller
@RequestMapping("/process")
public class ActivitiController {

	@Resource
	ProcessEngine processEngine;
	
	@RequestMapping
	public String list(Model model){
		
		
		RepositoryService repositoryService = processEngine.getRepositoryService();
		
		
		String[] tmp = ActivitiUtil.getTemplate(); 
		model.addAttribute("list", tmp);
		System.out.println("list:"+tmp.length);
		return "activiti/process/template";
	}
}
