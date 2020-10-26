package com.dana.springTask.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dana.springTask.Bean.Employee;
import com.dana.springTask.Bean.Job;
import com.dana.springTask.Repository.EmployeeRepository;
import com.dana.springTask.Repository.JobRepository;

@Service
public class CompanyService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private JobRepository jobRepository;
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(long employeeId) {
		return employeeRepository.getOne(employeeId);
	}
	
	public List<Employee> getAllEmployeeByName(String name){
		return employeeRepository.findByName(name);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public List<Job> getAllJobs(){
		return jobRepository.findAll();
	}
	
	public List<Job> getJobsByEndDate(Date endDate){
		return jobRepository.findByEndDate(endDate);
	}
	
	public List<Job> getJobsByDates(Date endDate, Date startDate){
		return jobRepository.findByEndDateBetween(startDate, endDate);
	}
}
