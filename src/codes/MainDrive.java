package codes;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int[] myNumbers = new int [6];
		
		for (int i = 0; i < 6; i++) {
			
			while (true) {
				System.out.print((i+1) + "번째 숫자 : ");
				int inputNum = myScanner.nextInt();
				
				boolean isRangeOk = 1 <= inputNum && inputNum <= 45;
				
				boolean isRepeat = false;
				
				for (int num : myNumbers) {
					if (num == inputNum) {
						isRepeat = true;
					}
				}
				
				if (isRangeOk && !isRepeat) {
					myNumbers[i] = inputNum;
					break;
				}
			}
		}
		
		int[] winNumbers = new int[6];
		
//		임시로 로직 확인용 하드코딩
		winNumbers[0] = 10;
		winNumbers[1] = 11;
		winNumbers[2] = 20;
		winNumbers[3] = 21;
		winNumbers[4] = 30;
		winNumbers[5] = 31;
		
//		당첨번호 랜덤으로 작성
		
		
//		몇등인지 맞추는 로직 진행
//		당첨번호 확인
		int correctCount = 0;
		
		for (int myNum : myNumbers) {
			for (int winNum : winNumbers) {
				if (myNum == winNum) {
					correctCount++;
				}
			}
		}
		
//		보너스 번호 뽑기
		int bonusNum = 0;
		while (true) {
//			Math.random() => Double  0 .. 1
			int randomNum = (int) (Math.random() * 45 + 1);
			
			boolean isRangeOk = (1 <= randomNum && randomNum <= 45);
			
			boolean isRepeat = false;
			
			for (int num : winNumbers) {
				if (num == randomNum) {
					isRepeat = true;
				}
			}
			
			if (isRangeOk && !isRepeat) {
				bonusNum = randomNum;
				break;	
			}			
		}
		
		
//		당첨 등수 확인
		if (correctCount == 6) {
			System.out.println("축 당첨 - 1등");
		} else if (correctCount == 5) {
//			보너스 번호와의 동일여부 > 2등과 3등의 분기처리
			System.out.println("축 당첨 - 2등");
			
			System.out.println("축 당첨 - 3등");
		} else if (correctCount == 4) {
			System.out.println("축 당첨 - 4등");
		} else if (correctCount == 3) {
			System.out.println("축 당첨 - 5등");
		} else {
			System.out.println("낙첨 되었습니다.");
		}
		
//		당첨 등수 확인(switch문 활용)
//		switch (correctCount) {
//		case 6:
//			System.out.println("축 당첨 - 1등");
//			break;
//		case 5:
//			System.out.println("축 당첨 - 3등");
//			break;
//		case 4:
//			System.out.println("축 당첨 - 4등");
//			break;
//		case 3:
//			System.out.println("축 당첨 - 5등");
//			break;
//		default:
//			System.out.println("낙첨 되었습니다.");
//			break;
//		}
		
		
		
		
		
	}
}
