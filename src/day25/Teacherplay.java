package day25;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Teacherplay {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	/*	do {
		playTeacher();
		System.out.println("더하시겠어요? (y/n)");
		if(scan.next().equals("n"))break;
		}while(true);*/
		
		do {
			int a=playTeacher2();
			if(a==3)break;
			}while(true);
		
		
	}
private static int playTeacher2() {
	System.out.println("사용자 : ");
	int count =0;
	try {
		RPS com = randomRPS2();
		System.out.println("컴퓨터 : "+com);
		RPS user = RPS.valueOf(scan.next());
		State state = resultState(user, com);
		System.out.println(state);
	count=state==State.WIN? count+1:0;	
	}
	catch(IllegalArgumentException e) {
		System.out.println("? 머함");
	}
	return count;
	}
private static State resultState(RPS user, RPS com) {
	if(user==com)return State.DRAWWWWWWWWWWWW;
	switch(user) {
	case 가위 :
		return com==RPS.보? State.WIN:State.LOSE;
	case 바위 :
		return com==RPS.가위? State.WIN:State.LOSE;
	default :
		return com==RPS.바위? State.WIN:State.LOSE;
	}
	
}
private static RPS randomRPS2() {
	RPS[ ]rpss = RPS.values();
	int r=(int)(Math.random()*3);
	
	return rpss[r];
}
static void playTeacher() {
	

	System.out.println("사용자 : ");
	String user = scan.next();
	String com = randomRPS();
	System.out.println("컴퓨터 : "+com);
	int res = compare(user,com);//1:사용자승, 0:비김, -1:컴퓨터 승
	printResult(res);
	
	
	}
private static void printResult(int res) {

	switch (res){
	case 1: System.out.println("승리");
		break;

	case 0: System.out.println("무승부!");
		break;

	case -1: System.out.println("패배!");
		break;
	default :
	}	
}
private static int compare(String a, String b) {
	if(a.equals(b))
	return 0;
	switch(a) {
	case "가위" :
		return b.equals("보")? 1: -1;
	case "바위" :
		return b.equals("가위")? 1: -1;
	default :
		return b.equals("바위")? 1: -1;  
	
	}
}
private static String randomRPS() {
	List<String> list = Arrays.asList("가위","바위","보");
	int r = (int)(Math.random()*3);
	return list.get(r);
}
}
enum RPS{
	가위,바위,보
}

enum State{
	WIN, LOSE, DRAWWWWWWWWWWWW
}