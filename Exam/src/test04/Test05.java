package test04;
/*
 * Date : 30th,June
 * Name : Justina
 * Content : String, Wrapper 클래스 연습문제
 */

public class Test05 {
	public static void main(String[] args) {
		
		String strCsv = "60,72,82,86,92";  //단일문자열  숫자배열 아니다!
		String[] scores = strCsv.split(",");  //split ()에는 구분자 들어간다 ,가 구분자역할한다
		
		int total = 0;
		
		for(int i =0; i<scores.length ; i++) {
			
			total += Integer.parseInt(scores[i]);//total은 숫자 60,,, 문자열 변형해줘야함
					
		}
		
		System.out.println("총점 : " +total);
	}

}
