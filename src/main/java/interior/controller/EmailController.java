package interior.controller;

import interior.dto.EmailDTO;
import interior.entities.Email;
import interior.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
@CrossOrigin(origins = "https://interior-design-8ipb.onrender.com/")
public class EmailController {
    private final EmailService emailService;
    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping
    public ResponseEntity<List<Email>> getAllEmails() {
        List<Email> emails = emailService.getAllEmails();
        return ResponseEntity.ok(emails);
    }

    @PostMapping
    public ResponseEntity<Email> createContact(@Valid @RequestBody EmailDTO emailDTO) {
        Email email = emailService.addEmail(emailDTO);
        return ResponseEntity.ok(email);
    }


}

