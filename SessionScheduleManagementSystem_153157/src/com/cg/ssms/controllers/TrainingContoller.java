package com.cg.ssms.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ssms.beans.ScheduledSessions;
import com.cg.ssms.service.ITrainingService;

@Controller
public class TrainingContoller {

	@Autowired
	ITrainingService iTrainingService;
	
	@RequestMapping(value="/")
	public ModelAndView getAllCustomers() 
	{
		ArrayList<ScheduledSessions> scheduledsessions=iTrainingService.getAllSessions();
		
		return new ModelAndView("ScheduledSessions","scheduledsessions",scheduledsessions);
	}

}
