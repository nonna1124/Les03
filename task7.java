package by.htp.les03.main;

import java.util.Random;

public class task7 {
	
	public static void main(String[] args) {
		int n=10;
		int[] array= new int[n];
		Random rand= new Random();
			
	    for (int i=0; i < array.length; i++) {
	        array[i]=rand.nextInt(100); 
		     System.out.print(array[i]+ "  ");
	     }
	
	     System.out.println();	
	     
	     int max=  array[0];
	     int imax=0;
	     int min= array[0]; 
	     int imin=0;
	     for (int i=0; i < array.length; i++) {
	    	 if(array[i] > max) { 
	    		 max=array[i];
	    		 imax=i;
	    	 }
	    	 else if(array[i] < min) { 
			     min=array[i];
			     imin=i;
			 }
	     }
	     array[imax]=min;
	     array[imin]=max;
	     for (int i=0; i < array.length; i++) {	
	    	 System.out.print(array[i]+"  ");
	     }
	 }
} 
	    
	    	    	
	  
	     
	     

	

