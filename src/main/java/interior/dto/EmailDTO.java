package interior.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class EmailDTO {
	
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email must be valid")
    private String email;

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}