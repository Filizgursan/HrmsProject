package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class JobTitle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Id'lerin nasıl artacağı
	@Column(name = "id")
	private int id;
	
	@Column(name="title")
	private String JobTitle;
	
	public JobTitle() {
		
	}
	public JobTitle(int id, String jobTitle) {
		super();
		this.id = id;
		JobTitle = jobTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

}
