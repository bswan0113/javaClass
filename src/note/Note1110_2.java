package note;

public class Note1110_2 {

	/* 컬렉션(Collection)
	 *	-자바에서 제공하는 자료구조를 담당하는 프레임워크(사용이 편하도록 쉽게 만들어진 틀)
	 *	-추가, 삭제, 정렬 등의 기능 처리가 간단하게 해결되어 자료구조적 알고리즘을 구현할 필요가 없음
	 *	-java.util 패키지에 포함되며, 인터페이스를 통해 정형화된 방법으로 다양한 컬렉션 클래스 이용 가능 
	 *
	 * 	배열의 문제점
	 * 	1. 한번 크기를 지정하면 변경할 수없다.
	 * 	-크기가 부족하면 에러발생, 넉넉하게 할당하면 메모리가 낭비됨
	 * 	-필요에 따라 늘이거나 줄일 수 없음
	 * 
	 * 	2. 배열에 기록된 데이터에 대한 중간 위치의 추가, 삭제가 불편하다
	 * 	
	 * 
	 * 	3. 한타입의 데이터만 저장 가능하다.
	 * 
	 * 	컬렉션의 장점
	 * 	1. 저장하는 크기의 제약이 없다.
	 * 	2. 추가, 삭제, 정렬 등의 기능 처리가 내장되어있음
	 * 	3. 여러 타입의 데이터가 저장 가능하다. 객체만 저장할수있기때문에 기본 자료형을 저장해야 하는경우 Wrapper클래스사용
	 * 
	 * 	List 
	 * 	-자료를 순차적으로 나열한 자료구조로 인덱스로 관리되며 중복해서 객체 저장가능, 구현클래스로 ArrayList, Vector, LinkedList
	 * 	
	 * 	Set
	 * 	-저장 순서가 유지되지않고, 중복 객체도 저장하지 못하는 자료 구조, 구현 클래스로 HashSet, LinkedSet,TreeSet
	 * 
	 * 	ArrayList
	 * 	-List의 후손으로 초기 저장용량은 10으로 자동설정, 용량이 초과되면 자동으로 늘어나며 고정 및 따로 지정도 가능, 동기화 불가능
	 * 
	 * 	Vector
	 * 	-List의 후손 ArrayList와 동등하지만 동기화제공, 성능이 낮음
	 * 
	 * 	LinkedList
	 * 	-인접 참조를 링크해 체인처럼 관리, 
	 * 	 객체삽입과 삭제시 앞뒤 링크만 변경하면 되기때문에 삭제/삽입이 빈번한곳에선 ArrayList보다 성능이 좋음
	 * */
}
