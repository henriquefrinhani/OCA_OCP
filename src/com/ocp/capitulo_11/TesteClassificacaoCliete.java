package com.ocp.capitulo_11;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TesteClassificacaoCliete {
	public static void main(String[] args) {
		List<Cliente> listCliente = new ArrayList<>();
		listCliente.add(new Cliente("pedro", "222", 5.78));
		listCliente.add(new Cliente("Ana", "123", 87.984));
		listCliente.add(new Cliente("Carla", "789", 5.8));

		for (Cliente c : listCliente) {
			System.out.println(c.getNome());
		}
		System.out.println("________________________________");

		Collections.sort(listCliente);

		for (Cliente c : listCliente) {
			System.out.println(c.getNome()+" %"+c.getPorcentagem());
		}
	}
}