package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationInfoService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.EducationInfo;
import kodlamaio.hrms.dataAccess.abstracts.EducationInfoDao;

@Service
public class EducationInfoManager implements EducationInfoService{
	private EducationInfoDao educationInfoDao;

	@Autowired
	public EducationInfoManager(EducationInfoDao educationInfoDao) {
		super();
		this.educationInfoDao = educationInfoDao;
	}

	@Override
	public Result add(EducationInfo educationInfo) {
		this.educationInfoDao.save(educationInfo);
		return new SuccessResult("Eğitim Bilgisi Eklendi.");
	}
}
