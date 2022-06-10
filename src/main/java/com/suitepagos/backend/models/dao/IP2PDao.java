
package com.suitepagos.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.Bank;
import com.suitepagos.backend.models.entity.IdentificationCode;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.PhoneCode;

public interface IP2PDao extends JpaRepository<P2P, Long>{
	
	@Query("from PhoneCode")
	public List<PhoneCode> findAllPhones();
	
	@Query("from IdentificationCode")
	public List<IdentificationCode> findAllIdentifications();
	
	@Query("from Bank")
	public List<Bank> findAllBanks();

}
