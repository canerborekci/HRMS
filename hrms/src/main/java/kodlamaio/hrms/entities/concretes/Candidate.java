package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Entity
@Table(name="candidates")
public class Candidate extends User {
	public Candidate(Integer id, String email, String password, String firstName, String lastName, String identificationNumber,
			Date birthDate) {
		
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.birthDate = birthDate;
	}
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@Column(name="identification_number", nullable = false)
	private String identificationNumber;
	
	@Column(name="birth_date", nullable = false)
	private Date birthDate;

	
	

}
