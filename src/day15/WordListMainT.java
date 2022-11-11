package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordListMainT {

	public static void main(String[] args) {
		ArrayList<Word> wordList = new ArrayList<Word>();
		
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		
		do {
			printMenu(
					"메뉴",
					"1.단어 추가",
					"2.단어 확인",
					"3.단어 수정",
					"4.단어 삭제",
					"5. 종료",
					"메뉴 입력 : "
					);
			
			try {
				menu = scan.nextInt();
				runMenu(menu, wordList);
				//선택한 메뉴실행
				
				}catch(InputMismatchException e) {	System.out.println("------------------------");
				System.out.println("에러발생: 정수를 입력하세요..");
				System.out.println("------------------------");
				scan.nextLine();}
					catch(Exception e) {
				
					System.out.println("------------------------");
					System.out.println(e.getMessage());
					System.out.println("------------------------");
					scan.nextLine();
				}
			
		}while(menu!=5);
		

	}

	private static void runMenu(int menu, ArrayList<Word> wordList) throws Exception{
		switch(menu) {
		case 1: insertWord(wordList);//단어추가
		
			break;
		case 2:	printWord(wordList);
			break;
		case 3: updateWord(wordList);
			break;
		case 4: deleteWord(wordList);
			break;
		case 5: System.out.println("시스템을 종료합니다.");
			break;
		default:throw new Exception("예외 발생 : 잘못된 번호입니다. 다시 입력해주세요.");
		}
	}
private static void deleteWord(ArrayList<Word> wordList) throws Exception {
	Scanner scan = new Scanner(System.in);
	//수정할 단어 입력 : play
	System.out.print("삭제할 단어를 입력해주세요. : ");
	String word = scan.next();
	//단어장에서 입력단어와 일치하는 단어객체를 가져옴
	//실제 단어 번지 : 1, 2, 4
	//0번지 : 1, 1번지 : 2, 2번지 : 3
	ArrayList<Integer> indexList = findWordList(wordList, word);
	
	//가져온 단어 객체들을 출력
	if(indexList==null || indexList.size()==0) {
		throw new Exception ("에에에에러러러러: 해당 단어가 없스요 없구요.");
	}
	for(int i=0; i<indexList.size(); i++) {
		int index = indexList.get(i);
		System.out.println(i+1+". " + wordList.get(index));
	}
	//화면에서 보여준 번호 1. 2. 3.
	System.out.print("삭제할 단어의 번호를 입력해주세요 : ");
	int index = scan.nextInt()-1;
	if(index<0 || index>=indexList.size()) {
		throw new Exception("에러에러에러에러에러 : 번호를 잘못입력했습니다.");
	}
	System.out.println(wordList.get((int)indexList.get(index)) + " 삭제했지롱");
	wordList.remove((int)indexList.get(index));
	}

	/* apple : 사과
 * play : 놀다
 * play : 놀이
 * boy : 소녀
 * allocate : 변호하다
 * run : 실행하다.
 * play : 수행하다
 * run : 뛰다
 * */
	private static void updateWord(ArrayList<Word> wordList) throws Exception {
		Scanner scan = new Scanner(System.in);
		//수정할 단어 입력 : play
		System.out.print("수정할 단어를 입력해주세요. : ");
		String word = scan.next();
		//단어장에서 입력단어와 일치하는 단어객체를 가져옴
		//실제 단어 번지 : 1, 2, 4
		//0번지 : 1, 1번지 : 2, 2번지 : 3
		ArrayList<Integer> indexList = findWordList(wordList, word);
		
		//가져온 단어 객체들을 출력
		if(indexList==null || indexList.size()==0) {
			throw new Exception ("에에에에러러러러: 해당 단어가 없스요 없구요.");
		}
		for(int i=0; i<indexList.size(); i++) {
			int index = indexList.get(i);
			System.out.println(i+1+". " + wordList.get(index));
		}
		//화면에서 보여준 번호 1. 2. 3.
		System.out.print("수정할 단어의 번호를 입력해주세요 : ");
		int index = scan.nextInt()-1;
		if(index<0 || index>=indexList.size()) {
			throw new Exception("에러에러에러에러에러 : 번호를 잘못입력했습니다.");
		}
		scan.nextLine();
		System.out.println("");
		//수정할 단어 번호를 입력 : 3번 입력 => 4번지
		System.out.print(word + " : ");
		//수정할 뜻을 입력 받음 : 3번 입력 => 4번 객체
		String mean = scan.nextLine();
		//선택된 단어의 뜻을 수정
		Word tmp = wordList.get(indexList.get(index));
		tmp.setMean(mean);
		
		
		
		
		
	}

	private static ArrayList<Integer> findWordList(ArrayList<Word> wordList, String word) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		for(int i = 0; i<wordList.size(); i++) {
			if(wordList.get(i).equals(word)) {
				list.add(i);
			}
		}
		
		return list;
	}

	private static void insertWord(ArrayList<Word> wordList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("저장할 단어를 입력해주세요 . : ");
		String word = scan.next();
		scan.nextLine();
		System.out.println(word +"의 뜻을 입력해주세요.");
		String mean = scan.nextLine();
		wordList.add(new Word(word, mean)); // 이부분을 생각 못함;
		
	}
	public static void printWord(ArrayList<Word> wordList) throws Exception {
		if(wordList ==null || wordList.size()==0) {
			throw new Exception("삐이잉이ㅣ기이이익 예외 발생 : 저장된 단어가 없습니다.");
			
		}
		
		for(Word tmp : wordList) {
			System.out.println(tmp);
		}
		
	}

	private static void printMenu(String ...str) {
		for(int i =0; i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
