package polymorphism;

public class Cake {

	String ingredient1;
	String ingredient2;
	String ingredient3;
	
	public String recipe(String ingredient1) {
		System.out.println(ingredient1);
		return ingredient1;
		
	}
	
	public String recipe(String ingredient1, String ingredient2) {
		System.out.println(ingredient1+" "+ingredient2);
		return ingredient2;
	}

	public String recipe(String ingredient1, String ingredient2, String ingredient3) {
		System.out.println(ingredient1+" "+ingredient2+" "+ingredient3);
		return ingredient3;
		
	}
}
