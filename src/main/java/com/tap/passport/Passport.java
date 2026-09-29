package com.tap.passport;

import java.time.LocalDateTime;

import com.tap.User.UserData;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passportId;
	private String passportNumber;
	private LocalDateTime issuedDate;
	private LocalDateTime expiryDate;
	
	 @OneToOne
	 @JoinColumn(name="user_id") 
	private UserData userData;
	 
	 

	public Passport(int passportId, String passportNumber, LocalDateTime issuedDate, LocalDateTime expiryDate,
			UserData userData) {
		this.passportId = passportId;
		this.passportNumber = passportNumber;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
		this.userData = userData;
	}

	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public LocalDateTime getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDateTime issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	
	
	 
	

}
