package com.sample.cache.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sample.cache.dao.CacheDao;
import com.sample.cache.model.JobDetails;

@Service
public class CacheService {

	@Autowired
	CacheDao cacheDao;
	
	@Cacheable("jobDetails")
	public List<JobDetails> getJobDetails(JobDetails jobDetails) {
		List<JobDetails> availableJobs = new ArrayList<JobDetails>();
		try
        {
            System.out.println("Going to sleep for 10 Secs.. to simulate backend call.");
            Thread.sleep(1000*10);
            
            availableJobs = cacheDao.findAllByJobNameAndJobLocation(jobDetails.getJobName(),jobDetails.getJobLocation());
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
		System.out.println(availableJobs);
		return availableJobs;
	}

}
