package com.sample.cache.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.cache.model.JobDetails;
import com.sample.cache.service.CacheService;

@RestController
public class CacheController {
	
	@Autowired
	CacheService cacheService;
	
	@GetMapping("/getJobs")
	public List<JobDetails> getJobDetails(@RequestParam Map<String, String> requestParams){
		JobDetails jobDetails = new JobDetails();
		jobDetails.setJobLocation(requestParams.get("location"));
		jobDetails.setJobName(requestParams.get("name"));
		
		System.out.println("Getting job details from service");
		return cacheService.getJobDetails(jobDetails);
		
	}

}
