package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.Candidates;

public interface ICandidateService {
	
	
	DataResult<List<Candidates>>getAll();

}
