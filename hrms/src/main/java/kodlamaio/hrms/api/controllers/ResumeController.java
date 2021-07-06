package kodlamaio.hrms.api.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationInfoService;
import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.business.abstracts.ProgrammingLanguageService;
import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EducationInfo;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;
import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.concretes.ProgrammingLanguage;
import kodlamaio.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {
	private ResumeService resumeService;
	private EducationInfoService educationInfoService;
	private JobExperienceService jobExperienceService;
	private ForeignLanguageService foreignLanguageSerivce;
	private ProgrammingLanguageService programmingLanguageService;
	private PhotoService photoService;
	
	public ResumeController(ResumeService resumeService, EducationInfoService educationInfoService,
			JobExperienceService jobExperienceService, ForeignLanguageService foreignLanguageSerivce,
			ProgrammingLanguageService programmingLanguageService, PhotoService photoService) {
		super();
		this.resumeService = resumeService;
		this.educationInfoService = educationInfoService;
		this.jobExperienceService = jobExperienceService;
		this.foreignLanguageSerivce = foreignLanguageSerivce;
		this.programmingLanguageService = programmingLanguageService;
		this.photoService = photoService;
	}
	
	@PostMapping("/ResumeAdd")
	public Result add(@RequestBody Resume resume) {
		
		return this.resumeService.add(resume);
		
	}
	
	@GetMapping("/ResumeGetAll")
	public DataResult<List<Resume>> getAll() {
		
		return this.resumeService.getAll();
	}
	
	@PostMapping("/EducationInfoAdd")
	public Result add(@RequestBody EducationInfo educationInfo) {
		
		return this.educationInfoService.add(educationInfo);
		
	}
	
	@PostMapping("/JobExperienceAdd")
	public Result add(@RequestBody JobExperience jobExperience) {
		
		return this.jobExperienceService.add(jobExperience);
		
	}
	
	@PostMapping("/ForeignLanguageAdd")
	public Result add(@RequestBody ForeignLanguage foreignLanguage) {
		
		return this.foreignLanguageSerivce.add(foreignLanguage);
		
	}
	
	@PostMapping("/ProgrammingLanguageAdd")
	public Result add(@RequestBody ProgrammingLanguage programmingLanguage) {
		
		return this.programmingLanguageService.add(programmingLanguage);
		
	}
	
	@PostMapping("/PhotoAdd")
    public Result add(@RequestParam String path, @RequestParam int resumeId) throws IOException {
        // path parameter  is a picture's path from your computer, such as : "/home/meb/Pictures/Bing/demo.jpg"
        // path parametresine istediğiniz bir dosyanın tam yolunu girin, örnek: "/home/meb/Pictures/Bing/demo.jpg"

        return this.photoService.add(resumeId,path);
    }
	
	
}
