package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer extends Users{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="company_name")
	private String company_Name;
	
	@Column(name ="web_address")
	private String web_Address;
	
	public Employer() {
		
	}
	public Employer(int id, String company_Name, String web_Address) {
		super();
		this.id = id;
		this.company_Name = company_Name;
		this.web_Address = web_Address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public String getWeb_Address() {
		return web_Address;
	}
	public void setWeb_Address(String web_Address) {
		this.web_Address = web_Address;
	}
}
