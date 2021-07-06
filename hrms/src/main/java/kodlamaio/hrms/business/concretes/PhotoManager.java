package kodlamaio.hrms.business.concretes;

import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.photo.CloudinaryService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PhotoDao;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrms.entities.concretes.Photo;
import kodlamaio.hrms.entities.concretes.Resume;


@Component
@SpringBootApplication
@Service
public class PhotoManager implements PhotoService{
	 CloudinaryService cloudinaryService;
	 PhotoDao photoDao;
	 ResumeDao resumeDao;



	    @Autowired
	    public  PhotoManager(CloudinaryService cloudinaryService, PhotoDao photoDao, ResumeDao resumeDao){

	        this.resumeDao=resumeDao;
	        this.cloudinaryService=cloudinaryService;
	        this.photoDao=photoDao;
	    }


	    @Override
	    public Result add(int resumeId,String path) throws IOException {// path mean is location of your image you wanted to upload

	        Resume resume=resumeDao.getOne(resumeId);
	        File file= (new File(path));


	        String link=cloudinaryService.upload(file);// uploading image to cloudinary
	        // if you get errors about fileservice which implemented by CLOUDINARY you should check my pom.xml dependency
	        // and "core/utilities/image" system

	        Photo photo=new Photo(0,link,resume);

	        resume.setPhoto(photo);


	        photoDao.save(photo);
	        resumeDao.save(resume);
	        return new SuccessResult("Image inserted to resume that resume_id is "+ resumeId+", Link of picture"+link);
	    }
}
