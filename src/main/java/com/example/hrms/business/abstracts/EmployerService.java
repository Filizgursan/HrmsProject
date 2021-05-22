package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	void Save(Employer employer);
	List<Employer> getAll();

	Employer getById(int id);
	Employer getByPhoneNumber(String phoneNumber);
}
