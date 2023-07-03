package test04;
/*
 * Date : 30th,June
 * Name ; Justina
 * Content : 자바 API클래스 연습문제
 */



class Apple {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
	}
	
	public void show() {
		System.out.println("원산지 : " +country);
		System.out.println("가격 : " + price);
	}
}
class Banana {
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
}
	public void show() {
		System.out.println("원산지 : " +country);
		System.out.println("가격 : " + price);
	}

class Grape extends Object {
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country ;
		this.price = price ;
		
	}
	
	public void show() {
		System.out.println("원산지 : " +country);
		System.out.println("가격 :" +price);
	}
}
}
