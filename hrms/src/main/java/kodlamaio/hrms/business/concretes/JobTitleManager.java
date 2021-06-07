package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	private JobTitleDao jobPositionsDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}



	@Override
	public DataResult<List<JobTitle>> getAll() {
		
		return new SuccessDataResult<List<JobTitle>>(this.jobPositionsDao.findAll(),"Data Listelendi.");
	}



	@Override
	public Result add(JobTitle jobTitle) {
		this.jobPositionsDao.save(jobTitle);
		return new SuccessResult("Job Title Eklendi");
	}
	
	
	

}
