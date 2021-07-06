package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="photos")
public class Photo {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="photo_id")
	    private int photoId;

	    @Column(name="url")
	    private String url;


	    @OneToOne()@JsonBackReference
	    @JoinColumn(name="resume_id")
	    private Resume resume;
}
