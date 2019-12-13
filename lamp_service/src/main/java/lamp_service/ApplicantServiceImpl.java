package lamp_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import lamp_data.Applicant;

import lamp_data.ApplicantRepository;
import lamp_data.GeneratedToken;


public class ApplicantServiceImpl implements ApplicantService{
	
	@Autowired
	ApplicantRepository applicantRepository;
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public Applicant register(Applicant applicant) {
		return applicantRepository.save(applicant);
	}
		
	public void sendmail(Applicant applicant) {
		GeneratedToken gen=  new GeneratedToken();
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(applicant.getEmail());
		message.setSubject("Email Testing");

		message.setText("Click on the link to confirm your account"+ " " +  "http://localhost:8080/changepassword?token="+gen.genToken());
		
		javaMailSender.send(message);
	}

}
