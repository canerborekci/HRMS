package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
		
		@Autowired
		public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
			super();
			this.jobAdvertisementDao = jobAdvertisementDao;
		}
		
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Data eklendi.");
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Data getirildi.");
			
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatus() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByStatus(), "Açık olan ilanlar getirildi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByLastDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"releaseDate");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployers_CompanyNameAndStatus(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployers_CompanyNameAndStatus(companyName), "Data getirildi." );
	}

	@Override
	public Result update(int id, boolean status) {
		JobAdvertisement jobAdvertisementUpdate = this.jobAdvertisementDao.findById(id).get();
		jobAdvertisementUpdate.setStatus(status);
		this.jobAdvertisementDao.save(jobAdvertisementUpdate);
		return new SuccessResult("İş ilanının statüsü değiştirildi.");
	}

	

}
