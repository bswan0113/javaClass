package kioskManager;

import java.util.ArrayList;
import java.util.Scanner;

public class InventorySystem {
	/*필드
	 * 인벤토리리스트
	 * 스캐너
	 * 자산(정수형 변수로 설정)xx -> 클래스로 변경
	 * */
	static ArrayList<Inventory> inven = new ArrayList<Inventory>();
	static Scanner scan = new Scanner(System.in);
	static Asset asset= new Asset();
	static ArrayList<Goods> goodsList = new ArrayList<Goods>();
	
	{System.out.println("인벤토리관리 시스템을 실행합니다.\n");}
	
	//시스템기동
	public void run() {
		int menu=1213;
		do {
			printMenu();
			menu=scan.nextInt();
			scan.nextLine();
			runMenu(menu);
			System.out.println(goodsList);
			
		}while(menu!=8);
		System.out.println("시스템을 종료합니다.");
		
	}

//메인메뉴 실행
	private void runMenu(int menu) {
		switch(menu) {
		case 1: addItem();
			break;
		case 2:reviseItem();
			break;
		case 3:deleteItem();
			break;
		case 4:buyItem();
			break;
		case 5:sellItem();
			break;
		case 6: printSales();
			break;
		case 7: printItem();//제품 확인
			break;
		case 8:
			break;
		
		default: System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
private void printSales() {
	System.out.println("1.전체 순이익 확인");
	System.out.println("2.전체 매출 확인");
	System.out.println("3.연별 매출 확인");
	System.out.println("4.월별 매출 확인");
	System.out.println("5.일별 매출 확인");
	
	
}

//제품판매메소드
private void sellItem() {
	System.out.println("판매한 제품의 코드를 입력해주세요.");
	int goodsCode=scan.nextInt();
	scan.nextLine();
	if(goodsCode>goodsList.size()) {
		System.out.println("존재하지 않는 제품코드입니다.");
		return;
	}
	System.out.println("판매한 수량을 입력해주세요.");
	int Quantity=scan.nextInt();
	scan.nextLine();
	int totalPrice = (Quantity*(goodsList.get(goodsCode).getPrice()));
	asset.income(totalPrice);
	System.out.println("자산 잔고 금액 : " + asset.totalAsset);
}
//제품 출력메소드
private void printItem() {
	System.out.println("1.제품코드확인");
	System.out.println("2.제품재고확인");
	int select=scan.nextInt();
	scan.nextLine();
	switch(select) {
	case 1: printGoodsCode();
		break;
	case 2:
		break;
	default: System.out.println("비정상적인 접근입니다.");
	}
	
}

//전제품 코드확인
private void printGoodsCode() {
	for(Goods tmp : goodsList) {
		System.out.println(tmp);
	}
	
}
//제품구매메소드
private void buyItem() {
	System.out.println("구매한 제품의 코드를 입력해주세요.");
	int goodsCode=scan.nextInt();
	scan.nextLine();
	if(goodsCode>goodsList.size()) {
		System.out.println("존재하지 않는 제품코드입니다.");
		return;
	}
	System.out.println("구매한 수량을 입력해주세요.");
	int Quantity=scan.nextInt();
	scan.nextLine();
	int totalPrice = (Quantity*goodsList.get(goodsCode).getPurchase());
	asset.outcome(totalPrice);
	System.out.println("자산 잔고 금액 : " + asset.totalAsset);
	
}
//제품정보삭제
private void deleteItem() {
	try {
	System.out.println("삭제할 제품의 코드를 입력해주세요.");
	int goodsCode=scan.nextInt();
	scan.nextLine();	
	
	if(finalConfirm(goodsCode)) {
		goodsList.remove(goodsCode);
		System.out.println("삭제가 완료되었습니다.");
	}
	else {
		System.out.println("삭제를 취소합니다.");
	}}catch(Exception e) {
		System.out.println("존재하지 않는 제품코드입니다.");
		return;
	}
	

	
}
//최종확인
private boolean finalConfirm(int goodsCode) {
	System.out.println("정말 아래의 상품을 삭제하시겠습니까?");
	System.out.println(goodsList.get(goodsCode));
	char yOrN= scan.next().charAt(0);
	if(yOrN=='Y') return true;
	else {
		return false;
	}
}

//아이템 수정
private void reviseItem() {
	
	try{System.out.println("수정할 제품의 코드를 입력해주세요.");
	int goodsCode=scan.nextInt();
	scan.nextLine();	
	System.out.println("수정할 항목을 입력해주세요.");
	System.out.println("1.분류");
	System.out.println("2.제품명");
	System.out.println("3.구매가");
	System.out.println("4.판매가");
	int select=scan.nextInt();
	scan.nextLine();
	switch(select) {
	case 1:  reviseCategory(goodsCode);
		break;
	case 2: reviseName(goodsCode);
		break;
	case 3: revisePurchase(goodsCode);
		break;
	case 4: revisePrice(goodsCode);
		break;
		default: System.out.println("정확한 항목을 입력해주세요.");
	}
	}catch(Exception E) {
		System.out.println("비정상적인 접근입니다.");
	}
	
}

private void revisePrice(int goodsCode) {
	System.out.println("판매가를 어떻게 변경하시겠습니까?");
	int name = scan.nextInt();
	scan.nextLine();
	goodsList.get(goodsCode).setPrice(name);	
}

private void revisePurchase(int goodsCode) {
	System.out.println("구매가를 어떻게 변경하시겠습니까?");
	int name = scan.nextInt();
	scan.nextLine();
	goodsList.get(goodsCode).setPurchase(name);
}

private void reviseName(int goodsCode) {
	System.out.println("이름을 어떻게 변경하시겠습니까?");
	String name = scan.nextLine();
	goodsList.get(goodsCode).setName(name);
}

private void reviseCategory(int goodsCode) {
	System.out.println("분류를 어떻게 변경하시겠습니까?");
	String revise= scan.nextLine();
	goodsList.get(goodsCode).setCategory(revise);
	
}
//아이템 등록
private void addItem() {
	System.out.println("등록할 제품의 분류를 입력해주세요.");
	String category=scan.nextLine();
	System.out.println("등록할 제품의 이름을 입력해주세요.");
	String name = scan.nextLine();
	System.out.println("등록할 제품의 구매가를 입력해주세요.");
	int purchase = scan.nextInt();
	System.out.println("등록할 제품의 판매가를 입력해주세요.");
	int price = scan.nextInt();
	scan.nextLine();
	Goods newGoods = new Goods(category, name, purchase, price);
	System.out.println("등록이 완료 되었습니다.");
	goodsList.add(newGoods.goodsCode, newGoods);
}

//메인메뉴출력
	private void printMenu() {
		System.out.println("1.제품등록");
		System.out.println("2.제품수정");
		System.out.println("3.제품삭제");
		System.out.println("4.제품구매");
		System.out.println("5.제품판매");
		System.out.println("6.자산관리");
		System.out.println("7.제품확인");
		System.out.println("8.시스템 종료");

	}

	
	
}
