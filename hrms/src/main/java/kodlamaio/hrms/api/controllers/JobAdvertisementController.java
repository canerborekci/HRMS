package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/GetAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/GetAllActive")
	public DataResult<List<JobAdvertisement>> getByStatus(){
		return this.jobAdvertisementService.getByStatus();
	}
	
	@PostMapping("/Add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	
	@GetMapping("/GetAllSortedByLastDate")
	public DataResult<List<JobAdvertisement>> getAllSortedByLastDate(){
		return this.jobAdvertisementService.getAllSortedByLastDate();
	}
	
	@GetMapping("/getByCompanyNameAndStatus")
	public DataResult<List<JobAdvertisement>> getByEmployers_CompanyNameAndStatus(@RequestParam("companyName") String companyName){
		return this.jobAdvertisementService.getByEmployers_CompanyNameAndStatus(companyName);
	}
	
	@PostMapping("/setStatus")
	public Result update(int id , boolean status) {
		return this.jobAdvertisementService.update(id, status);
	}
}
