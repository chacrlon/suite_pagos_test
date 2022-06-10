package com.suitepagos.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone_code")
public class PhoneCode implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long phoneid;

	@Column(name="phonecode")
	private String phoneCode;

	
	public Long getPhoneid() {
		return phoneid;
	}


	public void setPhoneid(Long phoneid) {
		this.phoneid = phoneid;
	}


	public String getPhoneCode() {
		return phoneCode;
	}


	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}


	private static final long serialVersionUID = 1L;

}
