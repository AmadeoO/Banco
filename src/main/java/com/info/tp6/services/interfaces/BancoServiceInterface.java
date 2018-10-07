package com.info.tp6.services.interfaces;

import java.util.List;

import com.info.tp6.model.Banco;

public interface BancoServiceInterface {

	public Banco findOne(String id_banco);
	public List <Banco> findAll();
	public Banco findByName(String name);

}
