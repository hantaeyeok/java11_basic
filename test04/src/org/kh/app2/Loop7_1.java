package org.kh.app2;

public class Loop7_1 {

	public static void main(String[] args) {
		/*for(선언; 조건식; 증감식){
			for(선언 ; 조건식 ; 증감식){				조건식 동안 수행
				조건식 동안 수행;		수행이 완료되면  
			
			}
		}
		
		*/
		//중첩 for문을 활용하여 별찍기
		
		//1번
		/*
		 ****** 
		 ******
		 ******
		 ******
		*/
		
		System.out.println("1번");
		for(int i = 0; i < 4; i++) {					//i : 1 
			for(int j = 0; j<6; j++) {					//
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n=====================\n");
		
		System.out.println("2번");
		//2번
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 ******
		*/
		for(int i = 0; i <6;i++) {
			for(int j = 0; j < i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		
		System.out.println("3번");
		 /*
		 ******
		 *****
		 ****
		 *** 
		 ** 
		 *
		*/
		for(int i = 0; i < 6; i++) {
			for(int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
	
		System.out.println("4번");
		 /*
		 ******
		  *****
		   ****
		    ***
		     **
		      *
		*/
		for(int i = 0; i <6 ; i++) {
			for(int k = 0; k<i+1;k++ ) {
				System.out.print(" ");
			}
			for(int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
	
	
		System.out.println("5번");
	/*
			 *
		    **
		   ***
		  **** 
		 ***** 
		******
	*/
		for(int i = 0; i <6 ;i++) {
			for(int k = 6 ; k > i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");

		System.out.println("6번");
		/*
			*
			**
			***
			****
			*****
			******
			*****
			****
			***
			**
			*
		*/
		for(int i = 0; i <6;i++) {
			for(int j = 0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <6;i++) {
			for(int j =6; j > i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		
		System.out.println("7번");
		/*
			******
			*****
			****
			***
			**
			*
			**
			***
			****
			*****
	 		******
		*/
		for(int i = 0; i <6 ;i++) {
			for(int j =6; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<6;i++) {
			for(int j =0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		System.out.println("8번");
		/*
			    *
			   **
			  ***
			 ****
			*****
		   ******
			*****
			 ****
			  ***
			   **
			    *
			    *
		*/
		for(int i = 0; i < 6 ; i++) {
			for(int k =6; k>i;k--) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0;i<6;i++) {
			for(int k = 0;k<i+1;k++) {
				System.out.print(" ");
			}
			for(int j =6; j>i;j--) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		System.out.println("9번");
		/*
			*
		   ***
		  *****
		 *******
		*********
		*/
		
		for(int i=1; i<6; i++) {
			for(int k =5; k > i;k-- ) {
				System.out.print(" ");
			}
			for(int j=1; j < i*2; j++) {
				System.out.print("*");
			}
			for(int k =5; k > i;k-- ) {
				System.out.print(" ");
			}
			System.out.println();
		}
			
		System.out.println("\n=====================\n");
		System.out.println("10번");
		
		/*
		*********
		 *******
		  *****
		   ***
		    *
		*/
		for(int i =0;i<5;i++) {
			for(int k =0;k <i ;k++ ) {
				System.out.print(" ");
			}
			for(int j =9; j > i*2;j--) {
				System.out.print("*");
			}
			for(int k =0;k <i ;k++ ) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		System.out.println("11번");
		
		/*
			*
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    * 
		*/
		
		
		for(int i = 1;i<6;i++) {
			for(int k =5;k >i ;k-- ) {
				System.out.print(" ");
			}
			for(int j = 1; j<i*2; j++) {
				System.out.print("*");
			}
			for(int k =5;k >i ;k-- ) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 1; i<6;i++) {
			for(int k = 0 ;k<i;k++) {
				System.out.print(" ");
			}
			for(int j =9;j>i*2;j--) {
				System.out.print("*");
			}
			for(int k = 0; k<i;k++) {
				System.out.print(" ");
			}
			System.out.println();	
		}
		
		System.out.println("\n=====================\n");
		System.out.println("12번");
		
		/*
		***** *****
		****   ****
		***     ***
		**       **
		*         *
		**       **
		***     ***
		****   ****
		***** *****
		*/
		
		for(int i=1;i<6;i++) {
			for(int j =6;j>i;j--) {
				System.out.print("*");
			}
			for(int k = 1;k<i*2;k++) {
				System.out.print(" ");
			}
			for(int j =6;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=-2; j<i; j++) {
				System.out.print("*");
			}
			for(int k =7;k>i*2;k-- ) {
				System.out.print(" ");
			}
			for(int j=-2;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");	
	}
}
