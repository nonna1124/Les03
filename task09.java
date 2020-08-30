package by.htp.les03.main;

import java.util.Random;

public class task09 {
	public static void main(String[] args) {
		int n=10;
		int[] array= new int[n];
		Random rand= new Random();
			
	    for (int i=0; i < array.length; i++) {
	        array[i]=20-rand.nextInt(40); 
		     System.out.print(array[i]+ "  ");
	     }
	
	     System.out.println();
	     int indexPlus=0;
	     int indexMinus=0;
	     int indexNull=0;
	     for (int i=0; i < array.length; i++) {
	    	 if (array[i]>0) {
	    		indexPlus++; 
	    	 }
	    	 else if (array[i]<0) {
	    		 indexMinus++;
	    	 }
	      	 else if (array[i]==0) {
	    		 indexNull++;
	    	 }
	     }
	     System.out.println(indexPlus+" положительных элементов");
	     System.out.println(indexMinus+" отрицательных элементов");
	     System.out.println(indexNull+" нулевых элементов");
	     
	}     

}
