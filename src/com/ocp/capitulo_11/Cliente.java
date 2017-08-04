package com.ocp.capitulo_11;

import java.util.Comparator;

public class Cliente implements Comparable<Cliente>{
	private String nome;
	private String cpf;
	private Double porcentagem;
	
	public Cliente(String n, String c, Double d){
		nome = n ; cpf = c; porcentagem = d;;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public Double getPorcentagem(){
		return porcentagem;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.porcentagem.compareTo(o.getPorcentagem());
	}

	
}
