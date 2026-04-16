package com.dev_sandip.ExecHub.repository;

import com.dev_sandip.ExecHub.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, String> {
}
