package org.example.calculator.calculatorLV2;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AppLv2 {

  public static void main(String[] args) {
    int operand1, operand2;
    char operator;
    String command = "";

    CalculatorLv2 calculatorLv2 = new CalculatorLv2();
    Scanner scanner = new Scanner(System.in);

    while (!command.equals("exit")) {
      System.out.println("첫 번째 숫자를 입력하세요: ");
      operand1 = scanner.nextInt();

      System.out.println("두 번째 숫자를 입력하세요: ");
      operand2 = scanner.nextInt();

      System.out.println("사칙연산 기호를 입력하세요: ");
      operator = scanner.next().charAt(0);

      // 올바른 사칙연산 기호를 넣은 경우에만 result에 값이 들어옴
      // result 값이 있는 경우에만 resultList에 값을 추가
      Optional<Integer> result = calculatorLv2.calculate(operand1, operand2, operator);
      if (result.isPresent()) {
        calculatorLv2.getResultList().add(result.get());
      }

      System.out.println("---\n더 계산하시겠습니까?");
      System.out.println("'remove': 첫번째 결과값 삭제 후 결과 list 출력");
      System.out.println("'exit': 계산을 종료합니다");
      System.out.println("이외 다른 문자를 입력하면 계속 계산합니다\n---");
      command = scanner.next();

      // resultList의 원소 중 가장 첫번째 원소를 삭제하는 command
      // removeResult() method 호출 + resultList 원소 확인
      if (command.equals("remove")) {
        calculatorLv2.removeResult();

        List<Integer> list = calculatorLv2.getResultList();
        for (Integer each : list) {
          System.out.print(each + " ");
        }
        System.out.println("\n출력완료");

        System.out.println("---\n더 계산하시겠습니까?");
        System.out.println("'exit': 계산을 종료합니다");
        System.out.println("이외 다른 문자를 입력하면 계속 계산합니다\n---");
        command = scanner.next();
      }
    }

  }
}
