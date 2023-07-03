package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
			return num;
	}
	
	
	//동기화 블럭 : 스레드간의 경합을 막고 동기방식으로 실행(하기위한 블럭이다)
	public synchronized void setNum() {   //하나의 스레드만 진입할 수 있게 여기를 동기화해야한다.순서를 정한다
			this.num ++;  

	}

}
