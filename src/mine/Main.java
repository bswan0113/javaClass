package mine;

import java.util.Scanner;



public class Main{
	static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) { 	
    	int num =scan.nextInt();
    	int count=1;
    	int int1, int2;
    	int nextInt=num;
    	int nextInt2;
    	do {
    		if(nextInt<10) {
    			int1=0;
    			int2=nextInt;
    		}
    		else {
    			int1=nextInt/10;
    			int2=nextInt-(nextInt/10)*10;   			
    		}
    		nextInt=int1+int2;
    		nextInt2=int2*10+(nextInt-(nextInt/10)*10);
    		if(num==nextInt2)break;
    		nextInt=nextInt2;  		
    		count++;
    	}while(true);
        System.out.print(count);
    }
}