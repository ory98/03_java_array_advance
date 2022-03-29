package step3_01.arrayAdvance;

// 2차원 배열 > 세로줄 

public class ArrayEx36 {

	public static void main(String[] args) {
		
		int[] testArr1 = {1, 2, 3, 4, 5};
		int[][] testArr2 = {{1, 2, 3, 4, 5} , {6, 7, 8, 9, 10}};
		
		
		int[][] arr = new int[2][4]; // 배열 네 개가 세로로 두 줄 있다. 
		
	  //[세로][가로]
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[1][3] = 80;
		
		System.out.println("arr : " + arr);			// 주소 = 링크
		System.out.println("arr[0] : " + arr[0]);   // 주소 = 링크
		System.out.println("arr[1] : " + arr[1]);   // 주소 = 링크
		System.out.println();
		
		System.out.println("arr[0][0] : " + arr[0][0]); // 값
		System.out.println("arr[0][1] : " + arr[0][1]); // 값
		System.out.println("arr[0][2] : " + arr[0][2]); // 값
		System.out.println("arr[0][3] : " + arr[0][3]); // 값
		System.out.println();
		System.out.println("arr[1][0] : " + arr[1][0]); // 값
		System.out.println("arr[1][1] : " + arr[1][1]); // 값
		System.out.println("arr[1][2] : " + arr[1][2]); // 값
		System.out.println("arr[1][3] : " + arr[1][3]); // 값
		System.out.println();
		
		for (int i = 0; i < 2; i++) { // 앞 숫자가 0-1까지 돈다
			for (int j = 0; j < 4; j++) { // 뒤 숫자가 0-3까지 돈다
				System.out.print(arr[i][j] + " ");
			}	
			System.out.println(); // j가 다 돌고 한칸 띄우라는 것 
		}
		System.out.println();
		
		System.out.println("arr.length : " + arr.length); // 2차원 배열의 길이 = 2줄 
		System.out.println("arr[0].length : " + arr[0].length); // 0번째의 길이 = 4개  
		System.out.println("arr[1].length : " + arr[1].length); // 1번째의 길이 = 4개 
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) { // i의 길이
			for (int j = 0; j < arr[i].length; j++) { // j의 길이 
				System.out.print(arr[i][j] + " ");
			}	
			System.out.println(); // j가 다 돌고 한칸 띄우라는 것 
		}
		System.out.println();
		
		// 생각해보기 
		int[][] temp1 = arr;    // 주소 or 값  > 주소  // int[][] = 두줄 배열이다. (2차원)
		int[] temp2 = arr[0];   // 주소 or 값  > 주소  // int[] = 한줄 배열이다 (1차원)
		int[] temp3 = arr[1];   // 주소 or 값  > 주소
		int temp4 = arr[0][2];  // 주소 or 값  > 값    // int = 정수 
		int temp5 = arr[1][1];  // 주소 or 값  > 값   
		
	}	
}
