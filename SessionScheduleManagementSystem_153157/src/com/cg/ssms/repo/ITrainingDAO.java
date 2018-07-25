package com.cg.ssms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ssms.beans.ScheduledSessions;

public interface ITrainingDAO extends JpaRepository<ScheduledSessions, Integer>{

}
