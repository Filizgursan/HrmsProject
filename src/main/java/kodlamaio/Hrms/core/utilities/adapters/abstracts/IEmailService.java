package kodlamaio.Hrms.core.utilities.adapters.abstracts;

import kodlamaio.Hrms.entities.concretes.Users;

public interface IEmailService {
	boolean verify (Users users);
	void sendMail(String email,String message);

}
