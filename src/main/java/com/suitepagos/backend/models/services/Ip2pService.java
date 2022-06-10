package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.suitepagos.backend.models.entity.Bank;
import com.suitepagos.backend.models.entity.IdentificationCode;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.PhoneCode;
import com.suitepagos.backend.models.entity.Usuario;

public interface Ip2pService {

	public List<P2P> findAll();
	
	public Page<P2P> findAll(Pageable pageable);
	
	public P2P findById(Long id);
	
	public P2P save(P2P cliente);
	
	public void delete(Long id);
	
	
	
	public List<PhoneCode> findAllPhones();
	
	public List<IdentificationCode> findAllIdentificationCode();
	
	public List<Bank> findAllBank();
	
	public List<Usuario> findAllUser();

}
