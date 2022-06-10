package com.suitepagos.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.Cliente;
import com.suitepagos.backend.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

	@Query("from Region")
	public List<Region> findAllRegiones();
}