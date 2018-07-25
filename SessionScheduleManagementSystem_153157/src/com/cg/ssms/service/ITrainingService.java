package com.cg.ssms.service;

import java.util.ArrayList;

import com.cg.ssms.beans.ScheduledSessions;

public interface ITrainingService {

	public ScheduledSessions createSession(ScheduledSessions session);
	
	public ArrayList<ScheduledSessions> getAllSessions();
	
	public ScheduledSessions enrolledSession(int id);
	
}
