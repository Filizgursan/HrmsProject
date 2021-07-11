package kodlamaio.Hrms.core.utilities.adapters.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import kodlamaio.Hrms.core.utilities.adapters.abstracts.IUserCheckService;
import kodlamaio.Hrms.entities.concretes.Candidates;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServiceAdapter implements IUserCheckService{

	@Override
	public boolean checkIfRealPerson(Candidates candidates) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean check=false;
		try {
			check=client.TCKimlikNoDogrula(
						Long.valueOf(candidates.getIdentificationNumber()), 
						candidates.getFirstName(), 
						candidates.getLastName(), 
						candidates.getBirthDate());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return check;
	}

}
