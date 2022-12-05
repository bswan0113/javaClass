package exampleShopping;

import java.util.List;
import java.util.Scanner;

public class ProductServiceImp implements ProductService{

	@Override
	public boolean insertProduct(List<Product> productList, Product product) {
		if(productList ==null ||product==null)return false;
		if(productList.contains(product))return false;
		productList.add(product);
		return true;
	}


	@Override
	public boolean deleteProduct(List<Product> productList, Product product) {
		if(productList==null || productList.size()==0||product==null)
		return false;
		
		return productList.remove(product);
	}

	@Override
	public Product getProduct(List<Product> productList, int index) {
		if(productList==null||index<0||productList.size()<=index)
		return null;
		return productList.get(index);
	}

	@Override
	public boolean productStock(Product product, int amount) {
		
		return true;
	}

	@Override
	public Product inputProduct() {
		Scanner scan = new Scanner(System.in);
		System.out.println("분류 : ");
		String type =scan.nextLine();
		System.out.println("제품명 : ");
		String title =scan.nextLine();
		System.out.println("구매가 : ");
		int buyPrice = scan.nextInt();
		System.out.println("판매가 : ");
		int sellPrice = scan.nextInt();
		if(buyPrice> sellPrice) {
			return null;
		}
		return new Product(type, title, buyPrice, sellPrice);
	}

	@Override
	public boolean updateProduct(List<Product> productList, Product product, int index) {
		if(productList==null||productList.size()==0||index<0||product==null)
		return false;
		productList.set(index, product);
		return true;
	}


	@Override
	public Product getProduct(List<Product> productList, Product product) {
		int index =productList.indexOf(product);
		if(index<0)return null;
		return productList.get(index);
	}


}
