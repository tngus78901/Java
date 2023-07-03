package test3;

/*
 * Date : 23rd,June
 * Name : Justina
 * Content : Java class test
 */


class VipCustomer extends Customer   {
	
	private double saleRatio;  //내꺼에서 참조하는 경우 private
	
	public VipCustomer(int id, String name) {
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
		
	}
	
	@Override
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price * saleRatio);
		
	}
}
public class Test07 {
	public static void main(String[] args) {
		Customer	kim = new Customer(1001, "김춘추");
		VipCustomer lee = new VipCustomer(1002, "이순신");
		
		System.out.println("김춘추님이 지불할 금액 : " +kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액 : " +lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
		
	}

}
