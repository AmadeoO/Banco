package com.info.tp6.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



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

	public Banco(String idBanco, String nombre, String pais, String domicilio) {
		super();
		this.idBanco = idBanco;
		this.nombre = nombre;
		this.pais = pais;
		this.domicilio = domicilio;
	}

	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	

	
	

}
