package com.tap.passrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.tap.passport.Passport;

@Repository
@EnableJpaRepositories
public interface passportRepo extends JpaRepository<Passport, Integer> {

}
