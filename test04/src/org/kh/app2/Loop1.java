package org.kh.app2;

public class Loop1 {

	public static void main(String[] args) {
		//Loop(반복문) : for, while, do ~ while
		//for(초기식;조건식;증감식){반복해야할문장; }
		//for문은 조건식이 참일때동안 반복
		int n = 0;
		for(int i = 0; i < 10; i++) {		//0 1 2 3 4 5 6 7 8 9 10
			n += 1;							//1 2 3 4 5 6 7 8 9 10
		}//for
		System.out.println("n : "+n);
		
		System.out.println("\n------------------------------------\n");
		//배열 array
		int [] num = {80,95,75,60,100,65,70,90,85,95}; //배열 reference
		String names[] = {"김","이","박","최","정","오","배","강","장","계"};
		for(int i = 0; i <10;i++) {
			System.out.print("이름 : "+names[i]);
			System.out.print("\t\t점수 : "+num[i]+"\n");
		}
	
		System.out.println("\n------------------------------------\n");
		
		
		//총점 평균 학점 
		int max = 0;
		int min = num[0];
		int tot = 0;
		System.out.println("이름\t점수\t학점\t판정");
		for(int i = 0;i<10;i++) {
			tot += num[i];
			System.out.print(names[i]+"\t");
			System.out.print(num[i]+"\t");
			if(num[i] >=90) {
				System.out.print("A\t");
			} else if(num[i] >= 80) {
				System.out.print("B\t");
			} else if(num[i] >= 70) {
				System.out.print("C\t");
			} else if(num[i] >= 80) {
				System.out.print("D\t");
			} else {
				System.out.print("F\t");
			}
			
			if(num[i] >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			if(num[i]>max) max = num[i];
			if(num[i]<min) min = num[i];
		}
		System.out.println("총점은 : "+tot);
		System.out.println("평점은 : "+tot/10.0f);
		System.out.println("최대 점수 : "+max);
		System.out.println("최소 점수 : "+min);
		
		
		
		//학점
		//int grade = 0 ;
		
		
	}

}

//
//총점 평균 학점 (배열의 길이로)
		//총점
		/*int total = 0;
		float average = 0.0f;
		int num_length = num.length;
		
		for(int i = 0; i<num.length; i++) {
			total += num[i];
		}
		average = total / num_length;
		System.out.println("총점은 : "+total+"입니다.");
		System.out.println("평점은 : "+average+"입니다.");
		*/
