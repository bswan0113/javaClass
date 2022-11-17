package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LambdaEx01 {

	public static void main(String[] args) {
		ArrayList<Integer> abc = new ArrayList<Integer>();

		abc.add(6);
		abc.add(11);
		abc.add(14);
		abc.add(42);
		abc.add(11);
		abc.add(1);
		abc.add(16);
		abc.add(2);
		abc.add(0);
	/*	Collections.sort(abc, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		}); */
		Collections.sort(abc,(a,b)->(b-a));
		System.out.println(abc);
		

	}



	
	
}
