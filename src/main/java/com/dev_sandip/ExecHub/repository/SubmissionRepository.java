package com.dev_sandip.ExecHub.repository;

import com.dev_sandip.ExecHub.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission, String> {
}
