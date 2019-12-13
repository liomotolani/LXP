package lamp_service;

import lamp_data.Applicant;

public interface ApplicantService {
	
	public Applicant register(Applicant applicant);
	
	public void sendmail(Applicant applicant);

}
