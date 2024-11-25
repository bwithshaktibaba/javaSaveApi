package com.nik11.sem5.Repo;

import com.nik11.sem5.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
