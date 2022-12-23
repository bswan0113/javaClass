package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		
	
			int a = Integer.parseInt(br.readLine());
			int b;
			int c;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<a;i++) {
				b=Integer.parseInt(st.nextToken());
				c=Integer.parseInt(st.nextToken());
				tmp.add(b+c);
	}
		for(int aa : tmp) {
		
				bw.write(aa);
		
		} 
		bw.flush();
		bw.close();
		
}
}

