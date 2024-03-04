package org.kh.app2;

public class Loop7_1_test {

	public static void main(String[] args) {
		//

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
		
	

	
	
	
	}

}
