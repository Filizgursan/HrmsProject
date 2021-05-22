package com.example.hrms.entities.concretes;


import javax.persistence.*;

@Entity
@Table(name="employer_phones")
public class EmployerPhone{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "employer_id")
	private Employer employer;

	@Column(name = "phone_number")
	private String phoneNumber;

	
}