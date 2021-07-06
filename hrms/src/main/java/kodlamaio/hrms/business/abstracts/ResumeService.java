package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeService {
	public Result add(Resume resume);
	public DataResult<List<Resume>> getAll();
	DataResult<List<Resume>>   getByUserId(int userId);
}
