package sub5;

import java.util.Set;

/*
 * Date : 4th,July
 * Name : Justina
 * Content : Java 컬렉션 스트림 실습하기
 * 
 */

public class Person {
	
	private String name;
	private int age;
	
	
	//생성자
	public Person(String name, int age) {
		this.name = name ;
		this.age = age;
		
	}

	
	//Getter.setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	