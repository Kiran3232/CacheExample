package com.sample.cache.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.cache.model.JobDetails;

@Repository
public interface CacheDao extends CrudRepository<JobDetails, Long>{

	List<JobDetails> findAllByJobName(String jobName);
	
	List<JobDetails> findAllByJobNameAndJobLocation(String jobName, String jobLocation);

}
