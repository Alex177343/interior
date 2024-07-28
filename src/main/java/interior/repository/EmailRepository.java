package interior.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import interior.entities.Email;

@Repository
public interface EmailRepository extends MongoRepository<Email, String> {
}
