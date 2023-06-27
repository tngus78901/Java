package Ch07.sec02;


//287-288
public class SmartPhoneExample  {
	
	public static void main(String[] args) {
	 
		//Object instantiation
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		//To read the field that was extended by Phone
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	
	
		//To read field of SmartPhone
		System.out.println("와이파이 상태 :" + myPhone.wifi);
		
		//Invocation the method that extended form Phone
		myPhone.bell();
		
		
		}
}


