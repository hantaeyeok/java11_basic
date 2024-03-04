package org.kh.app;

import java.util.Scanner;

public class Condition5 {

	public static void main(String[] args) {
		/*	if elseif else
		 *  
		 * 	if(조건식1){
		 * 		실행문1;
		 * 	} else if(조건식1){
		 * 		실행문2;
		 *  } else if(조건식1){
		 *  	실행문3;
		 *  }else{
		 *  	실행문n;
		 *  }
		 * 
		 * 	if(조건식) 실행문1;
		 * 	else if(조건식2)	실행문2;
		 * 	else 실행문;
		 */
		
		/*
		 * switch(){
		 * 	case 값1 :
		 * 		실행문1;
		 * 		break;
		 *  case 값2 :
		 *  	실행문2;
		 *  	break;
		 *  case 값3 :
		 *  	실행문3;
		 *  	break;
		 * }
		 */		
//		Scanner scan = new Scanner(System.in);
//		int rank = scan.nextInt();
		int rank =1 ;
		String sisang = "";
		switch(rank) {
			case 1 :
				sisang = "최우수상";
				break;
			case 2 :
				sisang = "우수상";
				break;
			case 3 :
				sisang = "노력상";
				break;
			default :
				sisang = "";
		}
		String remark = "";
		switch(rank) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				remark = "우등생";
				break;
			default :
				remark = "일반";
		
		}
	System.out.println();
	}
}





