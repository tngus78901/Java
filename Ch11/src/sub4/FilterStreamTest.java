package sub4;


import java.util.Arrays;
import java.util.List;

/*
 * Date : 4th,July
 * Name : Justina
 * Content : Java 필터 스트림 실습하기
 * 
 */

public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);   //List는 순서가 중요하고 중복은 허용된다
		System.out.println(numbers);
		
		//중복제거 
		numbers.stream().distinct().forEach(num -> System.out.print(num + " , "));
		System.out.println("\n");
		
		// 5이상 데이터 필터링
		numbers
			.stream()
			.filter(num -> num >=5)
			.forEach(num -> System.out.print(num + " , "));  //stream은 데이터통로
		
		System.out.println("\n");
		
		// 중복제거, 짝수 데이터 출력
		numbers
			.stream()
			.distinct()
			.filter(num -> num % 2 == 0)   //.filter(num -> num/0)내가 쓴 식
			.forEach(num -> System.out.println(num + " , "));
		
	}

}
