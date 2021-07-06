package kodlamaio.hrms.business.abstracts;

import java.io.IOException;

import kodlamaio.hrms.core.utilities.results.Result;
public interface PhotoService {
	 Result add(int resumeId,String path) throws IOException;
}
