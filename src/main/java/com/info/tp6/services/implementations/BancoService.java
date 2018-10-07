package com.info.tp6.services.implementations;

import java.util.List;

//import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.tp6.model.Banco;
import com.info.tp6.repositories.BancoRepository;
import com.info.tp6.services.interfaces.BancoServiceInterface;

@Service
public class BancoService implements BancoServiceInterface{

	@Autowired
	private BancoRepository bancoRepository;

	@Override
	public Banco findOne(String id_banco){
		return this.bancoRepository.findById(id_banco);
	}

	@Override
	public List<Banco> findAll() {
		
		return null;//Lists(this.bancoRepository.findAll());
	}

	@Override
	public Banco findByName(String name) {
	
		return this.bancoRepository.findByNombre(name);
	}
}
