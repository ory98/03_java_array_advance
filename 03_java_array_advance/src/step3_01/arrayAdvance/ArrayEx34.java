package step3_01.arrayAdvance;

import java.util.Arrays;

// 배열의 주소 

public class ArrayEx34 {

	public static void main(String[] args) {
		
		int nVar1 = 10;		// 각자 값을 가지고있음 
		int nVar2 = nVar1; // 값을 대입 > 연결되어 있지 않음. 
		
		System.out.println("nVar1 : " + nVar1 + " / nVar2 : " + nVar2);
		nVar1 = 100;
		System.out.println("nVar1 : " + nVar1 + " / nVar2 : " + nVar2);
		System.out.println();
		
		int[] arr1 = {12, 56, 78, 83, 98}; // 링크로만 가지고 있음. 값을 가지고 있지 않음.  
		int[] arr2 = arr1;					// 주소(참조)값을 전달 
		
		System.out.println("arr1 : " + arr1 + " / arr2 : " + arr2);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		
		arr1[0] = 777;
		arr1[1] = 777;
		arr1[2] = 777;
		arr2[3] = 999;
		arr2[4] = 999;
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}

}
