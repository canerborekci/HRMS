package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getByStatus();
	DataResult<List<JobAdvertisement>> getAllSortedByLastDate();
	DataResult<List<JobAdvertisement>> getByEmployers_CompanyNameAndStatus(String companyName);
	Result update(int id , boolean status);
}
