package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Entity
@Table(name="employers")
public class Employer extends User {
	public Employer(Integer id, String email, String password, String companyName, String webAddress, String phoneNumber) {
		
		super(id, email, password);
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
	@Column(name="company_name", nullable = false)
	private String companyName;
	
	@Column(name="web_address", nullable = false)
	private String webAddress;
	
	@Column(name="phone_number", nullable = false)
	private String phoneNumber;
}
