package TesteOCA;

public class MyException {
	
	public static void main(String[] args) {
		try{
			new MyException().checkFood("refrigerante");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
	}

	private void checkFood(String food)throws Exception{
		
		switch(food){
		case "frango":
			throw new BadFoodException();
		case "macarrão":
			throw new BadFoodException();
		case "bolo":
			throw new BadFoodException();
		case "salgado":
			throw new BadFoodException();
		case "refrigerante":
			throw new BadFoodException();
		}
		
		System.out.println("Food: "+food);
	}
}
