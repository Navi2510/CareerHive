package com.portal.jobportal.repository;

import com.portal.jobportal.entity.JobSeekerApply;
import com.portal.jobportal.entity.JobSeekerProfile;
import com.portal.jobportal.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);

    @Modifying
    @Query("DELETE FROM JobSeekerApply j WHERE j.job.id = :jobId")
    void deleteByJobId(@Param("jobId") Integer jobId);


}
