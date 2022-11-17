package bookManager;

import java.util.ArrayList;
import java.util.Scanner;

public interface BookManagement {
	
	
	void inquireBook(ArrayList<Book> list,Scanner scan);
	void inquireAuthor(ArrayList<Book> list,Scanner scan);
	void inquirePublisher(ArrayList<Book> list,Scanner scan);
	void inquireCateogory(ArrayList<Book> list,Scanner scan);
	void printMenu();
	void runMenu(ArrayList<Book> list, int menu, Scanner scan);
	void addBook(ArrayList<Book> list, Scanner scan);
	void subMenu(ArrayList<Book> list, Scanner scan);
}
