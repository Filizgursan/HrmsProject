package com.example.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.hrms.entities.concretes.JobTittle;

public interface JobTitleDao extends JpaRepository<JobTittle,Integer>{
	Optional<JobTittle> findByTitle(@Param("title") String title);

}
