package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_experience")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Resume"})
public class JobExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_experience_id")
	private int jobExperienceId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "starting_date")
	private String startingDate;
	
	@Column(name = "still_work")
	private boolean stillWork;
	
	@Column(name = "finishing_date")
	private String finishingDate;
}
