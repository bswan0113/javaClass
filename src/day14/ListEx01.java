package day14;

public class ListEx01 {

	public static void main(String[] args) {
		/*Collection is Generic Class
		 * Generic Class is a class which decide field when it construct object
		 *  classname<classname> object = new constructor<classname>(); 
		 * 
		 * */
		
		A<Integer> a = new A<Integer>();
		a.num=10;
		System.out.println(a.num);
		
		A<String> b = new A<String>();
		b.num="Hey god";
		System.out.println(b.num);

	}

}
class A<T>{
	T num;
}