package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx42_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = 5; // > 배열의 가로 세로 사이즈가 같아서
		int road = 20; 
		
		int[][] map = {   
			{0,   1,  2,  3, 4},	
			{15, 20, 20, 20, 5},
			{14, 20, 20, 20, 6},
			{13, 20, 20, 20, 7},
			{12, 11, 10,  9, 8}
		};
		
		int player = 0;
		
		while(true) {
			
			// 화면출력
			System.out.println();
			
			for (int i = 0; i < size; i++) { // 사이즈보다 작을 때 진행 
				for (int j = 0; j < size; j++) {
					if (map[i][j] == road) 		  	System.out.print("■ "); // 로드인 경우 색네모 표시, 한 칸씩 떨어뜨리기 위해 스페이스 추가 
					else if (map[i][j] == player) 	System.out.print("P "); // 플레이어인 경우 p 표시
					else 							System.out.print("□ "); // 나머지는 빈네모 표시 
				}
				System.out.println();
			}
			System.out.println();

			
			// 입력받기
			System.out.print("1~3을 입력하세요 : ");
			int move = scan.nextInt();
			
			player += move; // player = player + move 
			
			player %= 16; // player = player % 16 > 16으로 나눈 나머지 값 > 16이 되면 다시 0의 자리로 이동 나머지 값의 자리로 이동 > 계속 반복  
			
		}

	}

}
