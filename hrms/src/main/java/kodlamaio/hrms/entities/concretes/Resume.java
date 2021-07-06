package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "resume")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Cv"})
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int cvId;
	
	@OneToOne
	@JoinColumn(name = "candidates")
	private Candidate candidate;
	
	
	@ManyToMany
	@JoinColumn(name = "school_id")
	private List<EducationInfo> educationInfo;
	
	@ManyToMany
	@JoinColumn(name = "job_experience_id")
	private List<JobExperience> jobExperience;
	
	@ManyToMany
	@JoinColumn(name = "foreign_language_id")
	private List<ForeignLanguage> foreignLanguage;
	
	@ManyToMany
	@JoinColumn(name = "programming_language_id")
	private List<ProgrammingLanguage> programmingLanguage;
	
	@OneToOne()
	@JoinColumn(name="photo_id")
	private Photo photo;
	
	@Column(name = "creation_date")
	private Date createdDate;
	
	@Column(name = "github_link")
	private String githubLink;
	
	@Column(name = "linkedin_link")
	private String linkedin;
	
	
	@Column(name = "cover_letter")
	private String coverLetter;
}
