package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.Candidate;

public interface CandidateService {

	List<Candidate> getAll();
	void Save(Candidate candidate);
	Candidate getById(int id);
	Candidate getByFirstName(String firstName);
	Candidate getByLastName(String lastName);
	Candidate getByEmailAdress(String string );
}
