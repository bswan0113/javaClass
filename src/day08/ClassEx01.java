package day08;

public class ClassEx01 {

	public static void main(String[] args) {
		//기본생성자 호출
		Point pt = new Point();
		pt.print();
		pt.move(4,5);
		pt.print();
		
		//생성자 오버로딩 호출
		Point pt1 = new Point(3,1);
		pt1.print();
		
		//복사 생성자 호출(생성자 오버로딩)
		Point pt2 = new Point(pt1);
		pt2.print();
		
		Point pt3 = new Point();
		

	}

}
/* 2차원 좌표평면의 임의의 점을 나타내는 클래스
 * - 필드: 
 * x좌표, y좌표
 * - 메소드(기능):
 * 좌표 출력 기능
 * */
 
class Point{
	private int x, y;
	public void print() {
		System.out.println("(" + x +", " + y + ")");
		
	}
	public void move(int x1, int y1){
		x =x1;
		y =y1;
		 // 내 필드의 값을 바꾸는 경우에는 대부분 리턴이 없음 => 100% 아님!
		
	}
	public Point() {
		x=3;
		y=3;
	}
	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public Point(Point zk) {
		x = 2*zk.x;
		y = 4*zk.y;
			
	}
}