package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null; // 숫자는 비어있다. 
		int elementCnt = 0; // 입력숫자는 없다.
		
		while (true) {
			
			for (int i=0; i<elementCnt; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if (elementCnt == 0) {   // 배열안 숫자의 갯수가 0일 때
					score = new int[elementCnt + 1];  // 배열 만들기 
				}
				else if (elementCnt > 0){ // 배열안 숫자의 갯수가 0보다 클 때 
					int[] temp = score;  // 일시적인 배열 만들기 
					score = new int[elementCnt + 1]; // 배신 : temp에게 배열 길을 넘기고 새로운 배열을 만듬 
														 
					for (int i=0; i<elementCnt; i++) { 
						score[i] = temp[i];          //	temp값을 score에 옮겨담기
					}
					
					temp = null; // 템프 지우기 
				}
				System.out.print("[추가]성적 입력 : ");
				int data = scan.nextInt();
				
				score[elementCnt] = data; 
				elementCnt++;
			}
			else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력 : "); 
				int delIdx = scan.nextInt(); 
				
				if (elementCnt-1 < delIdx || delIdx < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if (elementCnt == 1) {
					score = null;
				}
				else if (elementCnt > 1) { 
					int[] temp = score; //  temp에 score 넣는다. 
					score = new int[elementCnt - 1]; // 칸을 한칸 지운 배열(score)을 만든다.
					
					for (int i=0; i<delIdx; i++) {
						score[i] = temp[i];			// 배열을 옮겨 담기 
					}
					for (int i=delIdx; i<elementCnt-1; i++) { 
						score[i] = temp[i + 1];             // 고른 자리가 지운 자리일 경우, 기존의 배열의 옆 값을 넣는다. 
					}
					temp = null; // 일시적 배열 삭제 
				}
				
				elementCnt--;
			}
			else if (sel == 3) {
				System.out.print("[삭제]값 입력 : ");
				int delData = scan.nextInt();
				
				int delIdx = -1;                    // 존재하지 않는 값을 만들기 위해 -1 부터 시작 
				for (int i=0; i<elementCnt; i++) {
					if (score[i] == delData) {  
						delIdx = i;
					}
				}
				
				if (delIdx == -1) { 
					System.out.println("[메세지]입력하신 값은 존재하지 않습니다.");
					continue;
				}
				
				if (elementCnt == 1) {
					score = null;
				}
				else if (elementCnt > 1) {
					int[] temp = score;       // 일시적인 배열을 만들고 score 입력        
					score = new int[elementCnt - 1]; // 배신 , 1개 적은 새로운 배열 생성 
					
					int j = 0;
					for (int i=0; i<elementCnt; i++) {
						if (i != delIdx) {         // 배열의 자리의 숫자가 같지 않을때,,
							score[j++] = temp[i]; // 새로운 배열 자리에 넣고 숫자를 한 칸씩 당김
						}  // j번째에 넣고 j를 올림,,
					}
					
					temp = null;
				}
				
				elementCnt--;				
			}
			else if (sel == 4) {
				System.out.print("[삽입]인덱스 입력 : ");
				int insertIdx = scan.nextInt();
				
				if (elementCnt < insertIdx || insertIdx < 0) {
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("[삽입]값 입력 : ");
				int insertData = scan.nextInt();
				
				if (elementCnt == 0) {
					score = new int[elementCnt + 1]; // 새로운 배열 생성 
				}
				else if (elementCnt > 0) {
					int[] temp = score;        // 템프에 배열 넘김 
					score = new int[elementCnt + 1];  // 배신 , 한개 더 추가된 배열을 만듬 
					
					int j = 0;
					
					for (int i=0; i<elementCnt + 1; i++) {
						if (i != insertIdx) {     // 배열 자리의 숫자가 같지 않을 때 , 
							score[i] = temp[j++]; // 새로운 배열의 숫자를 기존의 숫자를 먼저 넣고 넣는다. 
						}
					}
					temp = null;
				}
				
				score[insertIdx] = insertData;  //추가된 자리에 추가된 값을 넣음 
				elementCnt++; // 배열 갯수는 증가 
			}
			else if (sel == 0) {  // 0번을 누르면 종료 
				break;
			}
		}

		scan.close();

	}

}