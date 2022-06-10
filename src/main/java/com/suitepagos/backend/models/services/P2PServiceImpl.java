
package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.IP2PDao;
import com.suitepagos.backend.models.entity.Bank;
import com.suitepagos.backend.models.entity.IdentificationCode;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.PhoneCode;
import com.suitepagos.backend.models.entity.Usuario;

@Service
public class P2PServiceImpl implements Ip2pService {

	@Autowired
	private IP2PDao p2pDao;

	@Override
	@Transactional(readOnly = true)
	public List<P2P> findAll() {
		return (List<P2P>) p2pDao.findAll();
	}

	@Override
	public Page<P2P> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P2P findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P2P save(P2P pp) {
		return p2pDao.save(pp);
	}
	

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PhoneCode> findAllPhones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdentificationCode> findAllIdentificationCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bank> findAllBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}

