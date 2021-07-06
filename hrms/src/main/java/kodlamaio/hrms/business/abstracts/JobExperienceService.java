package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	public Result add(JobExperience jobExperience);
}
