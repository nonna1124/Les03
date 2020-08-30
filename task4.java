package by.htp.les03.main;

import java.util.Random;

public class task4 {
	
	public static void main(String[] args) {
		int n=10;
		int[] array= new int[n];
		Random rand= new Random();
			
	    for (int i=0; i < array.length; i++) {
	        array[i]=rand.nextInt(100); 
		     System.out.print(array[i]+ " , ");
	     }
	
	     System.out.println();	 
	     for (int i=0; i < array.length; i++) { 
	     if (array[i]%2==0) {
	    	 System.out.print(array[i]+"   ");
	     }
	    	 
	     }
		
	}

}
