package by.htp.les03.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int n=5;
		int[] array= new int[2*n];
		Random rand= new Random();
			
	    for (int i=0; i < array.length; i++) {
	        array[i]=rand.nextInt(40); 
		     System.out.print(array[i]+ "  ");
	     }
	
	     System.out.println();
	     int max=array[0];
	     for (int i=0; i < array.length; i++) {
	    	 array[i]=array[i]+array[2*n-1-i];
	    	 
	    	 if (array[i]> max) {
	    		 max= array[i];
	    	 }
	    	 System.out.print(array[i]+"  ");
	     }
	     System.out.println();
	     System.out.println(max+" максимальный элемент нового массива");
	     
 
	}

}
