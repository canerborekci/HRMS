package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisement")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="job_adv_id", nullable = false)
	private int id;

	@Column(name="job_description", nullable = false)
	private String jobDdescription;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@Column(name="position_piece", nullable = false)
	private int positionPiece;
	
	@Column(name="last_date", nullable = false)
	private Date lastDate;
	
	@Column(name="release_date", nullable = false)
	private Date releaseDate;
	
	@Column(name="status", nullable = false)
	private boolean status;
	
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City cities;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employers;
	
	@ManyToOne()
	@JoinColumn(name = "job_title_id")
	private JobTitle job_title;
	
	
	
}
