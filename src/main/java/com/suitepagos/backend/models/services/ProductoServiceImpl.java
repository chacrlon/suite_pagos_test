package com.suitepagos.backend.models.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.suitepagos.backend.models.dao.ProductoRepository;
import com.suitepagos.backend.models.entity.Cliente;
import com.suitepagos.backend.models.entity.Producto;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;

	
	@Override
	@Transactional
	public List<Producto> listarProducto() {
    return (List<Producto>)repository.findAll();
    
	}


}
