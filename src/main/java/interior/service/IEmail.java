package interior.service;

import java.util.List;

import interior.dto.EmailDTO;
import interior.entities.Email;

public interface IEmail {
    List<Email> getAllEmails();
    Email addEmail(EmailDTO emailDTO);
}
