package by.htp.les03.main;

import java.util.Random;

public class task06 {

	public static void main(String[] args) {
		int n=10;
		int[] array= new int[n];
		Random rand= new Random();
			
	    for (int i=0; i < array.length; i++) {
	        array[i]=rand.nextInt(100); 
		     System.out.print(array[i]+ " , ");
	     }
	
	     System.out.println();	
	     
	     int z=25; 
	     int sum=0;
	     for (int i=0; i < array.length; i++) {
	    	 if (array[i]>z) {
	    		 array[i]=z;
	    		 sum=sum+1;
	    	 }
	    	 System.out.print(array[i]+"  ");
	     } 
	     System.out.println();
	     System.out.println("Заменили "+sum+" раз ");
	  

	}
 
}
