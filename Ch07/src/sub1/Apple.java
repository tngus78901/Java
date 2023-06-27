package sub1;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
	}

	@Override
	public String toString() {  //재정의할 떄 쓴다. toString
		
		System.out.println("객체 해시값 : " + hashCode());
		System.out.println("원산지 : " + this.country);
		System.out.println("가격 : " + this.price);
		
		return super.toString();
	}
}
