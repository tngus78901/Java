package test04;
/*
 * Date : 30th,June
 * Name ; Justina
 * Content : 리스트 연습문제
 */


import java.awt.List;
import java.util.Random;

public class Test07 {
	public static void main(String[] args) {
	
		
		//60 ~100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		List<Integer> list = createList();
		
		//printlist(createList());
		printlist(list);
	}
	
	public static void printlist( List<Integer>  scoreList) {
		
		int total = 0;
		int size = scoreList.size();
				
		for(int i=0 ; i <size ; i++ ) {
			
			int score = scoreList.get(i);
					
			total += score;
			
			System.out.print(score);
			
			if(i == size - 1) {
				System.out.println(" = ");
			}else {
				System.out.println(" + ");
			}
		}
		System.out.println(total);
	}

	public static Integer   createList() {
		
		List< Integer >  scoreList = new ArrayList<>();  //<>치한변수 선언
		Random rand = new Random();
		
		for(int i=1; i<=10; i++) {
			//60~100 사이 임의의 수
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		
		return scoreList;
	}
}