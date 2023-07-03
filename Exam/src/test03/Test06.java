package test03;
/*
 * Date : 23rd,June
 * Name : Justina
 * Content : Java class test
 */


class Rent {
	public void payment() {
		System.out.println("임대료를 받습니다.");
}
}

class Landload extends Rent {
	
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();  //ghcnf
		
	}
}
public class Test06 {
	public static void main(String[] args) {
		Landload master = new Landload();
		master.getMoney();
	}

}
