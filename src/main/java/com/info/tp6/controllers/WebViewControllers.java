package com.info.tp6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.info.tp6.model.Banco;
import com.info.tp6.repositories.BancoRepository;



@Controller
public class WebViewControllers {
	
	//private Banco banco;
	
	@Autowired
	private BancoRepository bancoRepository;

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String home(Model model) {
				
		//model.addAttribute("nombre", this.banco.getNombre());
		model.addAttribute("nombre", bancoRepository.findByNombre("TuBanco"));
				
		return "home";
	}

}
