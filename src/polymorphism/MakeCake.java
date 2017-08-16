package polymorphism;

public class MakeCake {

	public static void main(String[] args) {
		
		Cake cake=new Cake();
		cake.recipe("eggs");
		cake.recipe("eggs", "sugar");
		cake.recipe("eggs", "sugar", "butter");
		
		ChocolateCake chCake=new ChocolateCake();
		chCake.recipe("egg");

	}

}
