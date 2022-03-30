package step3_01.arrayAdvance;
/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

public class ArrayEx41_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ladder[][]= { 
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		
		// 화면 출력 
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) { // 특수문자 : ㅂ + 한자  // ladder.length > 세로줄의 길이 , ladder[i].length > 가로줄의 길이 
				if (ladder[i][j] == 0) {
					System.out.print(" │ ");
				}
				else if (ladder[i][j] == 1) {
					if (j != 0 && ladder[i][j-1] == 1) { // j는 0(첫번째 줄)이 아니고, [i][j-1] 도 1이면 [i][j]는 ─┤ 입력 
						System.out.print("─┤ ");
					}
					else if (j != ladder[i].length - 1 && ladder[i][j+1] == 1){ // j는 4(마지막 줄)이 아니고, [i][j+1] 도 1이면 [i][j]는 ├─ 입력
						System.out.print(" ├─");
					}
				}
			}
			System.out.println();
		}

		System.out.print("0~4 입력 : ");
		x = scan.nextInt();
		
		for (int i = 0; i < ladder.length; i++) {
			if (ladder[y][x] == 0) { // [y][x]가 0이면 아래로 이동 
				y++;
			}
			else if (ladder[y][x] == 1) {
				if (x != 0 && ladder[y][x-1] == 1) { // x가 0이 아니고, [y][x] 옆 [y][x-1]번째의 칸이 1이면 x값은 왼쪽 옆으로 이동 
					x--;
				}
				else if(x != 4 && ladder[y][x+1] == 1) { // x가 4가 아니고, [y][x] 옆 [y][x+1]번째의 칸이 1이면 x값은 오른쪽 옆으로 이동
					x++;
				}
				y++;
			}
		}
		
		System.out.println("x = " + x);
		//System.out.println("y = " + y);

		scan.close();

	}

}
