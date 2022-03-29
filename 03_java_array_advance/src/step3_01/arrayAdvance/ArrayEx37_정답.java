package step3_01.arrayAdvance;

/*
 *	# 2차원배열 기본문제[1단계]
*/

public class ArrayEx37_정답 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
			}
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		
		int tot = 0; 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
			}
		}
		System.out.println("tot = " + tot);
		System.out.println();
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		System.out.println();  // 위에 프린트로 끝나서 두번 입력해야 한줄이 띄어짐 
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		
		tot = 0; // 위에 int를 입력했기 때문에 리셋하고 다시 사용 가능 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					tot += arr[i][j]; 
				}
			}
		}
		System.out.println("tot = " + tot);
		System.out.println();
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt += 1; // cnt++이랑 같음
				}
			}
		}
		System.out.println("cnt = " + cnt);



	}

}
