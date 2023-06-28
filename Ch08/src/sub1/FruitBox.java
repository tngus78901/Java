package sub1;

/*
 * Date : 28th,June
 * Name : Justina
 * Content : to practice Generic
 */

public class FruitBox<T> {   //<>generic 기호
	
	private T fruit;   //T는 치환변수
	
	public T getFruit() {    //getter setter로 했음  밑에 꺼도 
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
