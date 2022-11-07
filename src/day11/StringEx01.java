package day11;

public class StringEx01 {

	public static void main(String[] args) {
		/* String 클래스는 문자열의 값을 수정할 수 없음.
		 * StringBuffer 클래스는 문자열의 값을 수정 할 수 있음.
		 * StringBuilder 클래스는 StringBuffer와 동일함
		 * StringBuffer는 쓰레드에서 safe기능을 제공하고, StringBuilder는 제공하지 않음
		 * */
		
		String str = "abc";
		System.out.println(str);
		str ="abcdefg1";
		
		System.out.println(str);
		
		
		/* length() : 문자열의 길이
		 * indexOf() : 해당 문자열/문자가 있는 위치를 0번지부터 탐색하여 위치가 첫번째로 시작하는 번지
		 * lastIndexOf() : indexOf()와 같으나 마지막번지부터 탐색
		 * contains(문자열 또는 문자) 해당 문자열/ 문자의 존재 여부를 알려줌
		 * subString(시작번지) :문자열의 시작번지부터 끝까지 부분 문자열을 추출
		 * subString(시작번지, 마지막번지) : 문자열의 시작번지부터 마지막번지 -1까지 부분문자열을 추출
		 * equals(문자열) : 문자열과 같은지 다른지를 비교하여 알려줌
		 * 문자열은 참조변수이기 때문에 ==를 통해서는 정확히 같은지 다른지를 비교할 수 없음.
		 *  참조변수 비교시 ==는 같은 객체를 비교할때에만 사용 가능
		 *  리터럴 문자열은 리터럴들만 모여있는 공간에 할당이 되는데, 같은 리터럴 문자열이 있는 경우
		 *  새로 만들지 않고 기존에 있는 리터럴 문자열의 주소를 반환
		 *  charAt(index) : 문자열에서 해당 번지에 있는 문자열을 반환
		 *  split(정규표현식) : 정규표현식을 기준으로 문자열을 추출하여 배열로 만듬
		 *  trim() : 시작 문자 앞에 있는 공백을 제거하고 마지막 문자 뒤에 있는 공백을 제거
		 * */
		System.out.println("문자열의 길이 : " + str.length() /*메서드*/);
		int [] arr = new int[5];
		System.out.println("배열의 길이 : " + arr.length  /*속성*/ );
		
		System.out.println("e의 위치 : " + str.indexOf("e"));
		System.out.println(str.lastIndexOf("g"));
		System.out.println(str.contains("abc"));
		System.out.println(str.contains("gg"));
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 4));
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str1과 str2가같다? : " + (str1 == str2));
		System.out.println("str1과 str3가같다? : " + (str1 == str3));
		System.out.println("str3과 str2가같다? : " + (str3 == str2));
		System.out.println("str1과 str2가같다?(equals) : " + (str1.equals(str3)));
		System.out.println("str1과 str3가같다?(equals) : " + (str1.equals(str2)));
		System.out.println("str3과 str2가같다?(equals) : " + (str3.equals(str2)));

		int a = 1;
		int b = 1;
		char c = 'A';
		int d = 65;
		int e = c+d;
		int f = 010;
		int g = 0Xeee6;
		int h = 0b111101;
		System.out.println(g);
		System.out.println(h);
		System.out.println(f);
		System.out.println(c==d);
		System.out.println(a==b);
		System.out.println(e);
		
		String str4 = "HELLO";
		System.out.println(str4 + "문자열에 2번지에 있는 문자 : " +str4.charAt(b));
		
		
		String fruit = "사과, 배, 오렌지, 귤";
		String []fruits = fruit.split(",");
		
		for(String tmp : fruits) {
			System.out.println(tmp);
		}
		
		String str5 = "\n\n		\t안녕하세요.\n\n";
		System.out.println("trim전 문자열 : " + str5);
		
		System.out.println("trim후 문자열 : " + str5.trim());
				
		
	

	}

}
