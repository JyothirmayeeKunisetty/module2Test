package com.cg.ssms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ssms.beans.ScheduledSessions;
import com.cg.ssms.service.ITrainingService;

@Controller
public class TrainingActionController {

	@Autowired
	ITrainingService iTrainingService;
	
	@RequestMapping(value="/Success")
	public ModelAndView enrolledSession(@ModelAttribute("scheduledsessions")Integer id)
	{
		ScheduledSessions scheduledSessions=iTrainingService.enrolledSession(id);
		
		return new ModelAndView("Success", "scheduledsessions", scheduledSessions);
	}
	
}
