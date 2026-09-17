package STEP2;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<String> results = new ArrayList<>(); // 계산 기록 저장을 위한 배열

    public void calculate(int num1, int num2, char op){
        int result = 0;
        switch(op){
            case '+':
                result = num1+num2;
                System.out.println("결과: " +num1 + " + " + num2 + " = " + result);
                results.add(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("결과: " +num1 + " - " + num2 + " = " + result);
                results.add(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("결과: " + num1 + " * " + num2 + " = " + result);
                results.add(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return;
                }
                else {
                    result = num1 / num2;
                    System.out.println("결과: " + num1 + " / " + num2 + " = " + result);
                    results.add(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("올바른 구호가 아닙니다.");
        }
    }
}
