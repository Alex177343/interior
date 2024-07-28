package interior.service;

import interior.dto.EmailDTO;
import interior.entities.Email;
import interior.repository.EmailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService implements IEmail {
    private final EmailRepository emailRepository;
    @Autowired
    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }


	@Override
	public List<Email> getAllEmails() {
		return emailRepository.findAll();
	}

	@Override
	public Email addEmail(EmailDTO emailDTO) {
		Email email = new Email();
		email.setEmail(emailDTO.getEmail());
		return emailRepository.save(email);
		
	}


}
