package by.htp.les02.main;

import java.util.Random;

public class task2 {
   
public static void main(String[] args) {
  		
	int[]mas= new int[10];
	
	Random rand= new Random();
	
	for (int i=0; i < mas.length; i++) {
	    mas [i]=rand.nextInt(3); 
		System.out.print(mas[i]+ " , ");
	}
	System.out.println();
	
	System.out.print("ћассив с индексами нулевых значений : ");
	
	for (int i=0; i < mas.length; i++) {
	
			 if (mas[i]==0) {		    
	             System.out.print(i+" , " );  	  
			 }
	}
}
}