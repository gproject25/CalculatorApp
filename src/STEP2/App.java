package STEP2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<String> resultView = new ArrayList<>();
        Calculator calculator = new Calculator();

        int num1,num2,input,input2;
        char arithmetic;
        String addRecord;

        while(true) {

            System.out.println("\n------- LEVEL2 계산기 -------");
            System.out.println("1. 계산하기");
            System.out.println("2. 기록보기");
            System.out.println("3. 기록삭제");
            System.out.println("4. Exit");
            System.out.println("------- ------------ -------\n");

            try {
                input = keyboard.nextInt();
                while(input != 1 && input != 2 && input != 3 && input != 4){
                    System.out.print("다시 입력하세요! (1,2,3,4):");
                    input = keyboard.nextInt();
                }
            } catch(InputMismatchException e){
                System.out.println("정수를 입력하세요! (1,2,3,4)");
                keyboard.nextLine();
                continue;
            }

            switch(input){
                case 1: //계산하지 -> Calculator.java
                    while(true){
                        try {
                            System.out.print("\n첫 번째 숫자를 입력하세요: ");
                            num1 = keyboard.nextInt();
                            if (num1 < 0)
                                throw new InputMismatchException("num1 error");
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("양의 정수가 아닙니다!");
                            keyboard.nextLine();
                        }
                    }
                    while(true){
                        try {
                            System.out.print("두 번째 숫자를 입력하세요: ");
                            num2 = keyboard.nextInt();
                            if (num2 < 0)
                                throw new InputMismatchException("num2 error");
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("양의 정수가 아닙니다!");
                            keyboard.nextLine();
                        }
                    }

                    keyboard.nextLine();
                    System.out.print("사칙연산 기호를 입력하세요 (+,-,*,/) : ");
                    arithmetic = keyboard.next().charAt(0);
                    while(arithmetic != '+' && arithmetic != '-' && arithmetic != '*' && arithmetic != '/'){
                        System.out.print("사칙연산 기호를 다시 입력하세요 (+,-,*,/) : ");
                        arithmetic = keyboard.next().charAt(0);
                    }
                    calculator.calculate(num1,num2,arithmetic);
                    break;
                case 2: //기록보기
                    calculator.viewResults();
                    break;
                case 3: //기록 삭제
                    //calculator.removeResult();
                    //calculator.viewResults();
                    break;
                case 4: //exit
                    return;
            }
        }

    }
}
