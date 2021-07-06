package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EducationInfo;

public interface EducationInfoService {
	public Result add(EducationInfo educationInfo);
}
