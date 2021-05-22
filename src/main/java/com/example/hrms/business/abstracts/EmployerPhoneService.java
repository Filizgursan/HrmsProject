package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.EmployerPhone;

public interface EmployerPhoneService {
	List<EmployerPhone> getAll();
	List<EmployerPhone> getByUserId(int userId);
}
