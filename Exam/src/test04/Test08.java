package test04;
/*
 * Date : 30th,June
 * Name ; Justina
 * Content : 로또번호 연습문제
 */


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test08 {
	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static  Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {  //;; 무한반복
			int num = (int) Math.ceil(Math.random()*45); 
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
				
			}
			
			
		}
		
		//정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
		
	}
}
