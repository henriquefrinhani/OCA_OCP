package com.ocp.capitulo_11;

public class EqualsTeste {
		private String nome;
		private String chassi;
		
		public EqualsTeste(String nome, String chassi){
			this.nome=nome;
			this.chassi = chassi;
		}
		
		public String getChassi(){
			return chassi;
		}
		
		public static void main(String [] args){
			EqualsTeste fusca = new EqualsTeste("fusca", "abc123");
			EqualsTeste gol = new EqualsTeste("Gol", "abc123");
			
			System.out.println(fusca.equals((Object)gol));
		}
		
		public boolean equals(Object o){
			
			if((o instanceof EqualsTeste) && ((EqualsTeste)o).getChassi() == this.chassi){
				return true;
			}else{
				return false;
			}
			
		}
}
