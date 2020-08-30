package by.htp.les02.main;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {

	     int[]mas= new int[5];
	     Random rand= new Random();
	
	     for (int i=0; i < mas.length; i++) {
	         mas[i]=i+2; 
		     System.out.print(mas[i]+ " , ");
	     }
	
	     System.out.println();	 
	
	     for (int i=0; i < mas.length-1; i++) {
	
		     if (mas[i]<mas[i+1]) 
	
	              System.out.print("Последовательность возрастающая");
	
		
	    }
	}
}
