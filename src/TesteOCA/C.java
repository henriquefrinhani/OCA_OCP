package TesteOCA;

public class C extends B {
	static{System.out.println("C1");}
	
	public static void main(String[] args){
		System.out.println("Inicio ");
		new C();
		System.out.println("Fim ");
	}
}
