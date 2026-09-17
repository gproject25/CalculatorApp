package STEP3;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number>  {
    private ArrayList<String> results = new ArrayList<>(); // 계산 기록 저장을 위한 배열
    private ArrayList<Double> resultValues = new ArrayList<>(); //결과만 저장

    public void calculate(T num1, T num2, char op){
        double result = 0;
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

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
                result = n1+n2;
                System.out.println("결과: " +num1 + " + " + num2 + " = " + result);
                results.add(num1 + " + " + num2 + " = " + result);
                resultValues.add(result);
                break;
            case SUBTRACT:
                result = n1-n2;
                System.out.println("결과: " +num1 + " - " + num2 + " = " + result);
                results.add(num1 + " - " + num2 + " = " + result);
                resultValues.add(result);
                break;
            case MULTIPLY:
                result = n1*n2;
                System.out.println("결과: " + num1 + " * " + num2 + " = " + result);
                results.add(num1 + " * " + num2 + " = " + result);
                resultValues.add(result);
                break;
            case DIVIDE:
                if(n2 == 0) { //0으로 나눈 예외 처리
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return;
                }
                else {
                    result = n1 / n2;
                    System.out.println("결과: " + num1 + " / " + num2 + " = " + result);
                    results.add(num1 + " / " + num2 + " = " + result);
                    resultValues.add(result);
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
        resultValues.remove(0);
        viewResults();
    }

    public void printGreater(double value) {
        resultValues.stream().filter(result -> result > value).forEach(result -> System.out.println(result));
    }
}

