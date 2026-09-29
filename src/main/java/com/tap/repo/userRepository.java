package com.tap.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.tap.User.UserData;


public interface userRepository extends JpaRepository<UserData, Integer> {

}
