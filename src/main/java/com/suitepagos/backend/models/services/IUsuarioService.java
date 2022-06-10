package com.suitepagos.backend.models.services;

import com.suitepagos.backend.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
