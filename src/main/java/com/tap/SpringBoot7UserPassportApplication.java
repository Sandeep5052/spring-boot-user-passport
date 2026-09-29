package com.tap;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tap.User.UserData;
import com.tap.passport.Passport;
import com.tap.passrepo.passportRepo;
import com.tap.repo.userRepository;

@SpringBootApplication
public class SpringBoot7UserPassportApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBoot7UserPassportApplication.class, args);
	userRepository userrepository=    context.getBean(userRepository.class);
	 passportRepo passwordrepo=   context.getBean(passportRepo.class);
	 
                    UserData user=	new UserData();
                    
                   
                    user.setUserName("mohan");
                    user.setGender("M");
              
                    
                    Passport passport= new Passport();
                  
                    passport.setPassportNumber("GSVUY3548");
                    passport.setIssuedDate(LocalDateTime.now());
                    passport.setExpiryDate(LocalDateTime.now());
                    
                    user.setPassport(passport);
                    passport.setUserData(user);
                    
                    userrepository.save(user);
                    
                    
	}

}
