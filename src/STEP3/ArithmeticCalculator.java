package STEP3;

import java.util.ArrayList;

public class ArithmeticCalculator {
    private ArrayList<String> results = new ArrayList<>(); // 계산 기록 저장을 위한 배열

    public void calculate(int num1, int num2, char op){
        int result = 0;

        OperatorType operator;
        if(op == '+')
            operator = OperatorType.ADD;
        else if(op == '-')
            operator = OperatorType.SUBTRACT;
        else if(op == '*')
            operator = OperatorType.MULTIPLY;
        else
            operator = OperatorType.DIVIDE;

        switch(operator){
            case ADD:
                result = num1+num2;
                System.out.println("결과: " +num1 + " + " + num2 + " = " + result);
                results.add(num1 + " + " + num2 + " = " + result);
                break;
            case SUBTRACT:
                result = num1-num2;
                System.out.println("결과: " +num1 + " - " + num2 + " = " + result);
                results.add(num1 + " - " + num2 + " = " + result);
                break;
            case MULTIPLY:
                result = num1*num2;
                System.out.println("결과: " + num1 + " * " + num2 + " = " + result);
                results.add(num1 + " * " + num2 + " = " + result);
                break;
            case DIVIDE:
                if(num2 == 0) { //0으로 나눈 예외 처리
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

    public ArrayList<String> getResults() {
        return results;
    }

    public void setResults(String result) {
        results.add(result);
    }

    public void viewResults(){
        if(results.isEmpty()){
            System.out.println("기록이 없습니다.");
            return;
        }

        System.out.println("------ 계산 기록 ------");
        for(int i=0; i<results.size(); i++)
            System.out.println("("+(i+1)+") " + results.get(i));
    }

    public void removeResult() {
        if(results.isEmpty()){
            System.out.println("삭제할 기록이 없습니다.");
            return;
        }

        System.out.println("데이터를 삭제했습니다! : " + results.get(0));
        results.remove(0);
        viewResults();
    }
}

