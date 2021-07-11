package kodlamaio.Hrms.core.utilities.adapters.abstracts;

import kodlamaio.Hrms.entities.concretes.Candidates;

public interface IUserCheckService {
	
	boolean checkIfRealPerson(Candidates candidates);

}
