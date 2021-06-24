package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
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
	
	@OneToMany(mappedBy = "employers")
	private List<JobAdvertisement> jobAdvertisement; 
}
