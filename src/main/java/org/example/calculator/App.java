package org.example.calculator;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App {
  public static void main(String[] args){
    int operand1, operand2;
    char operator;
    String command="";

    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
    Scanner scanner = new Scanner(System.in);

    while(!command.equals("exit")) {
      System.out.println("첫 번째 숫자를 입력하세요: ");
      operand1 = scanner.nextInt();

      System.out.println("두 번째 숫자를 입력하세요: ");
      operand2 = scanner.nextInt();

      System.out.println("사칙연산 기호를 입력하세요: ");
      operator = scanner.next().charAt(0);

      // 올바른 사칙연산 기호를 넣은 경우에만 result에 값이 들어옴
      // result 값이 있는 경우에만 resultList에 값을 추가
      Optional<Integer> result = arithmeticCalculator.calculate(operand1, operand2, operator);
      if(result.isPresent()) {
        arithmeticCalculator.addResultList(result.get());
      }

      System.out.println("더 계산하시겠습니까? (아무 문자나 입력해 주세요. 단, exit를 입력하면 종료됩니다)");
      command = scanner.next();

      // resultList의 원소 중 가장 첫번째 원소를 삭제하는 command
      // removeResult() method 호출 + resultList 원소 확인
      if(command.equals("remove")){
        arithmeticCalculator.removeResult();

        List<Integer> list = arithmeticCalculator.getResultList();
        for(Integer each : list){
          System.out.print(each+" ");
        }
        System.out.println("\nlist 출력완료");
      }
    }

  }
}
