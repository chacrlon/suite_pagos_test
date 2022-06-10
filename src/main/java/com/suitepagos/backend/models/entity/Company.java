package com.suitepagos.backend.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Company implements Serializable {

	private String name;
	private String catchPhrase;
	private String bs;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCatchPhrase() {
		return catchPhrase;
	}



	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}



	public String getBs() {
		return bs;
	}



	public void setBs(String bs) {
		this.bs = bs;
	}



	private static final long serialVersionUID = 1L;
}
