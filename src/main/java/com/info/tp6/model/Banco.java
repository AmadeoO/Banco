package com.info.tp6.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
@Entity(name = "Banco") //Hibernate
@Table(name = "banco")
public class Banco implements Serializable {

	public final static Long ID = 2L;
	
	@Id
	@Column (name = "id_banco")
	private String idBanco;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "pais", nullable = false)
	private String pais;
	
	@Column(name = "domicilio", nullable = false)
	private String domicilio;
	
	

	
	

}
