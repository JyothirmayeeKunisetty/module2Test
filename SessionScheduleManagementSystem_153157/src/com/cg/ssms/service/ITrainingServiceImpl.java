package com.cg.ssms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.ssms.beans.ScheduledSessions;
import com.cg.ssms.repo.ITrainingDAO;

@Component(value="service")
public class ITrainingServiceImpl implements ITrainingService{

	@Autowired
	private ITrainingDAO dao;
	
	@Override
	public ScheduledSessions createSession(ScheduledSessions session) {
		return dao.save(session);
	}
	
	@Override
	public ScheduledSessions enrolledSession(int id) {
		
		ScheduledSessions enrolledSession=dao.findOne(id);
		
		return enrolledSession;
	}
	
	@Override
	public ArrayList<ScheduledSessions> getAllSessions() {
		
		return (ArrayList<ScheduledSessions>) dao.findAll();
	}
}
