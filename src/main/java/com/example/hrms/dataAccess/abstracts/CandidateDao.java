package com.example.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.hrms.entities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate,Integer>{
	Optional<Candidate> findFirstByFirstNameIgnoreCase(@Param("firstName") String firstName);

}
