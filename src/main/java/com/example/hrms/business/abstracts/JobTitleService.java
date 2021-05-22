package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.JobTittle;

public interface JobTitleService {
	void save(JobTittle jobTittle);
	List<JobTittle> getAll();
	JobTittle getById(int id);
	JobTittle getByTitle(String title);
}