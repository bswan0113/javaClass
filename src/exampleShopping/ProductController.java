package exampleShopping;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
	private ProductService ps = new ProductServiceImp();
	private List<Product> productList;


	public ProductController(List<Product> productList) {
		this.productList = productList;
	}


	public void insertProduct() {
		//제품정보를 입력
		Product product = ps.inputProduct();
		//제품리스트에 정보를 추가
		if(ps.insertProduct(productList, product)) {
			System.out.println("제품을 등록했습니다.");
		}
		else {
			System.out.println("제품 등록에 실패했습니ㅏ");
		}
	}


	public void updateProduct() {
		Product newProduct = ps.inputProduct();
		int index=productList.indexOf(newProduct);
		if(ps.updateProduct(productList, newProduct, index)) {
			System.out.println("수정완료하였습니다.");
		}
		else {
			System.out.println("수정에 실패했습니다.");
		}
		
	}


	public void deleteProduct() {
		Product deleteProduct = ps.inputProduct();
		int index = productList.indexOf(deleteProduct);
		Product product = ps.getProduct(productList, index);
		if(ps.deleteProduct(productList, product)) {
			System.out.println("제품 삭제 완료");
		}
		else {
			System.out.println("제품 삭제 실패");
		}
	}







	
}
