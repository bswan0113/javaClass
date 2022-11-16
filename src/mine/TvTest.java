package mine;

public class TvTest {

	public static void main(String[] args) {

	}

	class VCTVR extends TV{
		VCR vcr = new VCR();
		
		void play() {
			vcr.play();
		}
		void stop() {
			vcr.stop();
		}
		
	}
	class TV{
		boolean power;
		int channerl;
		void power() {power=!power;}

		void channelUp() { ++channerl;}	
		void channelDwon() { --channerl;}
	}
	class VCR{
		boolean power;
		int count=0;
		void power() {power=!power;}
		void play() {};
		void stop() {};
	}
}
