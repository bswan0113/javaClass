package day12;

public class InterfaceEx01 {

	public static void main(String[] args) {
		//인터페이스를 통해서는 객체를 생성 할 수 없음
		//TvRemoteController tr =new TvRemoteController ();
		//but 인터페이스 참조 변수에 객체를 저장할 수 있다.
		//구현 클래스의 객체를 인터페이스 참조 변수에 저장할 수 있다.
		TvRemoteController remocon1 = new TvRemoconA()/*<= 구현클래스*/;
		//remocon1.print();
	//	((TvRemoconA)remocon1).print(); // 형변환을 해줘야함
		TvRemoconA r2 = new TvRemoconA();
		r2.turn();


		for(int i=0; i<10; i++) {
			r2.channelUp();
		}
		
		for(int i=0; i<4; i++) {
			r2.channelDown();
		}
		r2.channel(42);
		
		
		
		r2.print();
		r2.turn();
		r2.channel(21);
		r2.channel(14);
	
	}

}

