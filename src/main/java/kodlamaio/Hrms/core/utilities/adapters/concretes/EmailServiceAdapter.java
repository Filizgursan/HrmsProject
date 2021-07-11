package kodlamaio.Hrms.core.utilities.adapters.concretes;

import kodlamaio.Hrms.core.utilities.adapters.abstracts.IEmailService;
import kodlamaio.Hrms.entities.concretes.Users;

public class EmailServiceAdapter implements IEmailService{

	@Override
	public boolean verify(Users users) {
		return true;
	}

	@Override
	public void sendMail(String email, String message) {
		System.out.println(email +"adresine" + message + "gönderildi.");
	}

}
