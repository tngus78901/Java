package sub1;

public class Apple {
	/*
	 * Date : 28th,June
	 * Name : Justina
	 * Content : to practice Generic
	 */
	
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
		
	}
	@Override
	public String toString() {
		String result = "원잔지 : " + country + "\n가격 : "+price;
		return result;
		
	}

}
