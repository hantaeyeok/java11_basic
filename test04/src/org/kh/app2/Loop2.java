package org.kh.app2;

public class Loop2 {

	public static void main(String[] args) {
		int [] ns = {9, 12, 3, 7, 6, 8, 10, 11};
		int max = 0;
		int min = ns[0];						//0은 비교를 하지 못해 배열의 첫번째 크기로 비교했다.
		for(int i = 0; i < 8;i++) {
			if(ns[i]>max) max = ns[i];
			if(ns[i]<min) min = ns[i];
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
	}

}



//ns[i] ns[i+1]로 해보기
// compareto 사용해보기
