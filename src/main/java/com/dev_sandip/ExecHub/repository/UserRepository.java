package com.dev_sandip.ExecHub.repository;

import com.dev_sandip.ExecHub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
