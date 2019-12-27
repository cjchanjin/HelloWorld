package classes;

import java.util.Scanner;
 
public class BaseballExample {
    public static void main(String[] args) {
        // 숫자게임을 하기 위해서 컴퓨터가 가지고 있는 숫자들의 배열
        int[] cArrayNum = new int[3];
        // 사람이 입력할 숫자들의 배열
        int[] uAraayNum = new int[3];
        boolean game = true;
        int gameCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (game) {
            // 배열의 값이 중복 되지 않게 하기 위해서 처리 하는 과정 및 게임 시작 숫자 과정
            for (int i = 0; i < cArrayNum.length; i++) {
                // 컴퓨터 배열에 1 ~ 9까지 랜덤 숫자 생성
                cArrayNum[i] = (int) (Math.random() * 9 + 1);
                // 반복 해서 위치와 값이 같을경우 그해당위치에 숫자를 새로 생성하기 위한 작업
                for (int j = 0; j < i; j++) {
                    if (cArrayNum[i] == cArrayNum[j]) {
                        i--;
                        break;
                    }
                }
            }
            // 단위 테스트 : 컴퓨터가 설정한 값이 어떤 값인지 알아보기 위해서 테스트 한다.
            // for (int k = 0; k < cArrayNum.length; k++) {
            // System.out.print(cArrayNum[k] + " ");
            // }
            // 3 Strike를 했을경우 게임을 종료하게 한다.
            boolean player = true;
            // 몇번만에 게임을 완료했는지 카운트 해준다.
            int count = 0;
            System.out.println("숫자 야구를 시작하겠습니다. 숫자를 입력하세요");
            System.out.println("현재 게임을 종료하시려면 10을 입력하시고 프로그램을 종료하시려면 0을 입력하세요");
            while (player) {
                // Strike를 판별
                int strike = 0;
                // Ball을 판별
                int ball = 0;
                for (int i = 0; i < uAraayNum.length; i++) {
                    uAraayNum[i] = scanner.nextInt();
                    // 현재 게임을 포기할때 다음 10을 입력하면 현재 게임을 포기 할 수 있다.
                    if (uAraayNum[i] == 10) {
                        player = false;
                        break;
                    } else if (uAraayNum[i] == 0) {
                        player = false;
                        game = false;
                        break;
                    }
                }
                // 위치가 같은지 판별한다
                for (int i = 0; i < cArrayNum.length; i++) {
                    for (int j = 0; j < uAraayNum.length; j++) {
                        if (cArrayNum[i] == uAraayNum[j]) {
                            // 같은 위치에 같은 값이면 Strike
                            if (i == j) {
                                strike++;
                                // 다른 위치에 같은 값이면 Ball
                            } else if (i != j) {
                                ball++;
                            }
                        }
                    }
                }
 
                count++;
                if (player == true) {
                    System.out.println("Strike : " + strike + "\nBall : " + ball);
                }
                // Strike 가 3번 다 완료 되면 게임 종료
                if (strike == 3) {
                    System.out.println("3 Strike 이므로 게임을 종료합니다.\n" + count + "번 만에 맞추셨습니다.");
                    player = false;
                }
            }
            System.out.print("정답은 : ");
            for (int i = 0; i < cArrayNum.length; i++) {
                System.out.print(cArrayNum[i]);
                if (i == cArrayNum.length - 1) {
                    System.out.println("입니다.");
                } else {
                    System.out.print(",");
                }
            }
            if (game) {
                System.out.println("게임을 다시 시작하시겠습니까? 다시 시작하시려면 1번 종료하려면 0번을 입력하시기 바랍니다.");
                gameCount = scanner.nextInt();
                if (gameCount == 0) {
                    game = false;
                } else if (gameCount == 1) {
                    game = true;
                }
            }
        }
        scanner.close();
    }
}