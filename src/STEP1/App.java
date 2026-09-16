package STEP1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        App app = new App();

        int num1,num2;
        char arithmetic;
        String exitCalc;

        while(true) {
            try {
                System.out.print("\n첫 번째 숫자를 입력하세요: ");
                num1 = keyboard.nextInt();
                if (num1 < 0)
                    throw new InputMismatchException("num1 error");
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = keyboard.nextInt();
                if (num2 < 0)
                    throw new InputMismatchException("num2 error");
            } catch (InputMismatchException e) {
                System.out.println("양의 정수가 아닙니다!");
                keyboard.nextLine();
                continue;
            }
            keyboard.nextLine();

            System.out.print("사칙연산 기호를 입력하세요 (+,-,*,/) : ");
            arithmetic = keyboard.next().charAt(0);
            while(arithmetic != '+' && arithmetic != '-' && arithmetic != '*' && arithmetic != '/'){
                System.out.print("사칙연산 기호를 다시 입력하세요 (+,-,*,/) : ");
                arithmetic = keyboard.next().charAt(0);
            }
            //calculate(num1,num2,arithmetic); 계산 기능 추가

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exitCalc = keyboard.next();
            if(exitCalc.equals("exit"))
                return;
        }

    }
}
