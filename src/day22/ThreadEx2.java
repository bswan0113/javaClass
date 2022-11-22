package day22;

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread(); // 현재쓰레드정보를 호출하는 스태틱메소드
		System.out.println("현재 쓰레드명 : " +   t.getName());
		
		//Thread t2 = new Thread (new Thread02()); //runnable 인터페이스를 이용하면 스레드의 생성자를 활용해 객체생성
		Thread t2 =new Thread(()->{		
			for(int i=0; i<100; i++) 
			{System.out.print("|");}		
		});
		t2.start();
		for(int i=0; i<100; i++) 
		{System.out.print("-");}

		
	}

}

class Thread02 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.print("-");
		}
	}

}