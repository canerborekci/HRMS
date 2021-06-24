package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{
	@Query("From JobAdvertisement where status = true")
	List<JobAdvertisement> getByStatus();
	
	@Query("From JobAdvertisement where employers.companyName=:companyName and status=true")
	List<JobAdvertisement> getByEmployers_CompanyNameAndStatus(String companyName);
}
