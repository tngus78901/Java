package test3;

/*
 * Date : 23rd,June
 * Name : Justina
 * Content : Java class test
 */

class Customer {
	protected	int id;       //자식에서 부모님꺼 참조하는 상황에는 protected
	protected	String name;
	protected	String grade;
	protected	int point;
	protected	double pointRatio;
			
	public Customer(int id, String name) {
		this.id = id;
		this.name = name ;
		this.grade = "SILVER";
		this.pointRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
		
	}
	
	public void showInfo()  {
		System.out.println("=====================");
		System.out.println("고객번호 : " +id);
		System.out.println("고객이름 : " +name);
		System.out.println("고객등급 : " +grade);
		System.out.println("현재 포인트 : " +point);
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("----------------------");
		
	}

}
