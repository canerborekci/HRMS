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
@Table(name = "education_informations")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Resume"})
public class EducationInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_id")
	private int educationId;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "faculty")
	private String faculty;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "starting_date")
	private String startingDate;
	
	@Column(name = "is_active_student")
	private boolean isActiveStudent;
	
	@Column(name = "finishing_date")
	private String finishingDate;
	
	
}
