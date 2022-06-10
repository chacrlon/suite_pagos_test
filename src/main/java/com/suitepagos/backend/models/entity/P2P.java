
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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="p2p")
public class P2P implements Serializable {

	@Id
	@Column(name="p2pid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="el telefono no puede ser vacio")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="phoneid")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private PhoneCode phoneid;
	
	//@NotEmpty(message ="no puede estar vacio")
	@Column(name="phone", nullable=false)
	private int phone;
	
	@NotNull(message="la identificacion no puede ser vacia")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="identificationid")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private IdentificationCode identificationid;
	
	@NotEmpty(message ="no puede estar vacio")
	@Column(name="identification", nullable=false, unique=true)
	private String identification;

	@NotEmpty(message ="no puede estar vacio")
	@Column(name="name", nullable=false)
	private String name;

	//@NotEmpty(message ="no puede estar vacio")
	@Column(name="amount", nullable=false)
	private double amount;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="createdat")
	@Temporal(TemporalType.DATE)
	private Date createdat;
	
	@NotNull(message="No puede ser vacia")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="bankid")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Bank bankid;
	
	@NotNull(message="No puede ser vacia")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userid")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Usuario userid;

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public PhoneCode getPhoneid() {
		return phoneid;
	}



	public void setPhoneid(PhoneCode phoneid) {
		this.phoneid = phoneid;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public IdentificationCode getIdentificationid() {
		return identificationid;
	}



	public void setIdentificationid(IdentificationCode identificationid) {
		this.identificationid = identificationid;
	}



	public String getIdentification() {
		return identification;
	}



	public void setIdentification(String identification) {
		this.identification = identification;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public Date getCreatedat() {
		return createdat;
	}



	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}



	public Bank getBankid() {
		return bankid;
	}



	public void setBankid(Bank bankid) {
		this.bankid = bankid;
	}



	public Usuario getUserid() {
		return userid;
	}



	public void setUserid(Usuario userid) {
		this.userid = userid;
	}



	private static final long serialVersionUID = 1L;
}
