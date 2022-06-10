
package com.suitepagos.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suitepagos.backend.models.entity.Bank;
import com.suitepagos.backend.models.entity.IdentificationCode;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.PhoneCode;
import com.suitepagos.backend.models.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
