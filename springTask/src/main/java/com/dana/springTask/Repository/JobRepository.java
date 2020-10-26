package com.dana.springTask.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dana.springTask.Bean.Job;

public interface JobRepository extends JpaRepository<Job, Long>{

	List<Job> findByEndDate(Date endDate);
	
	List<Job> findByEndDateBetween(Date endDate, Date startDate);
}
