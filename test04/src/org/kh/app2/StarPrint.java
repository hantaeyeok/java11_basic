package org.kh.app2;

public class StarPrint {

	public static void main(String[] args) {
		// starPrint
		// 중첩 for문을 활용한 별찍기
		/*
		 
		 ******
		 ******
		 ******
		 ******
		 
		 */
		for(int i = 0; i < 4; i++) {						//
			for(int j = 0; j < 6; j++) {					//
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("1");
		
		/*
		 
		 * 				//i : 1
		 **				//i : 2
		 ***			//i : 3
		 ****
		 *****
		 ******
		 
		 */
		// j
		for(int i = 0; i <6 ; i++) {
			for(int j = 0 ; j < i ;j++) {
					System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println("2");
		
		
		for(int i = 0; i <6 ; i++) {
			for(int j = 0 ; j < i+1 ;j++) {
					System.out.print("*");
			}
			System.out.println();	
		}
		
		System.out.println("3");
		
		
		//j출력을 i 갯수만큼 출력하
		for(int i = 0; i<6;i++) {
			for(int j = 0; j <= i;j++) {
				System.out.print("*");
				}
				System.out.println();	
			}
		System.out.println("3-1");
		
		//무한루프 사용
		
		
		
		/*
		 
		 ****** 
		 *****
		 **** 
		 *** 
		 ** 
		 * 
		 
		 */
		//j가 하나씩 줄으면서 찍힘
		//i = 1 : j=6
		//i = 2 : j=5
		
		for(int i = 0; i < 6;i++) {
			for(int j = 0; j < 7-i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("4");
		
		//역 for문으로 만들어보기
		for(int i = 0; i < 6;i++) {
			for(int j = 6; j > i ; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("5");
		
		
		
		
		}
		
	}

			
	
	


