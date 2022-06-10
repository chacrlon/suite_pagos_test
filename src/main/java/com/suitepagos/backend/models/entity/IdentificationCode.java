package com.suitepagos.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identification_code")
public class IdentificationCode implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long identificationid;
	
	@Column(name="identificationcode")
	private String identificationCode;
	
	@Column(name="identificationdescription")
	private String identificationDescription;

	public Long getIdentificationid() {
		return identificationid;
	}




	public void setIdentificationid(Long identificationid) {
		this.identificationid = identificationid;
	}




	public String getIdentificationCode() {
		return identificationCode;
	}




	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}




	public String getIdentificationDescription() {
		return identificationDescription;
	}




	public void setIdentificationDescription(String identificationDescription) {
		this.identificationDescription = identificationDescription;
	}




	private static final long serialVersionUID = 1L;

}
