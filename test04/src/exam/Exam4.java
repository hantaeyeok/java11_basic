package exam;

public class Exam4 {

	public static void main(String[] args) {
		for(int i =1; i < 5 ;i ++) {
			for(int j = 4; j>i ;j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<i*2; k++) {
				System.out.print("*");
			}
			for(int j = 4; j>i;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		//다른 방법
		for(int i=1;i<5;i++) {
			for(int j= 4-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//마름모
		for(int i =1; i < 5 ;i ++) {
			for(int j = 4; j>i ;j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<i*2; k++) {
				System.out.print("*");
			}
			for(int j = 4; j>i;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i =0; i<4; i++) {
			for(int k =0;k <=i ;k++ ) {
				System.out.print(" ");
			}
			for(int j = 5 ; j>i*2; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//다른방법
		for(int i = 1;i<=7;i++) {
			if(i<=4) {
				for(int j= 4-i;j>0;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i*2-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j1=1;j1<i-3;j1++) {
					System.out.print(" ");
				}
				for(int j2=5;j2>i*2-10;j2--) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		}
	}

}
