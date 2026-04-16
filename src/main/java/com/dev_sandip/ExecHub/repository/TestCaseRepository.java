package com.dev_sandip.ExecHub.repository;

import com.dev_sandip.ExecHub.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseRepository extends JpaRepository<TestCase, String> {
}
