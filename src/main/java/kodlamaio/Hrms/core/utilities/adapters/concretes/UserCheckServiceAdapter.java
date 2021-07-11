package kodlamaio.Hrms.core.utilities.adapters.concretes;

import kodlamaio.Hrms.core.utilities.adapters.abstracts.IUserCheckService;
import kodlamaio.Hrms.entities.concretes.Candidates;

public class UserCheckServiceAdapter implements IUserCheckService{

	@Override
	public boolean checkIfRealPerson(Candidates candidates) {
		
		return true;
	}

}
