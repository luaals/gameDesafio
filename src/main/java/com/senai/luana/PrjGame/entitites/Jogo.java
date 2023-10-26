package com.senai.luana.PrjGame.entitites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_jogo")
public class Jogo {
	//id : Long
	//name : String
	//plataform: String
	//seters e geters
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "plataform")
	private String plataform;
	
	public Jogo() {

	}
	public Jogo(Long id, String name, String plataform) {
		super();
		this.id = id;
		this.name = name;
		this.plataform = plataform;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPlataform() {
		return plataform;
	}
	
	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}
}