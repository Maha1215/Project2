package abstraction;

public class Test {

	public static void main(String[] args) {
		MyPhone phone=new Iphone();
		phone.call();
        phone.text();
		
        RazrGeneration generation=new Iphone();
        generation.games();
	    generation.internet();
		
		Iphone iphone = new Iphone();
		iphone.fourG();
		iphone.anApp();
		iphone.socialMedia();
		

	}

}
