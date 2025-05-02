package org.example.calculator.calculatorLV1;

import java.util.Scanner;

public class App1 {

  public static void main(String[] args) {
    int operand1, operand2;
    char operator;
    String command = "";

    Scanner scanner = new Scanner(System.in);

    while (!command.equals("exit")) {
      System.out.println("첫 번째 숫자를 입력하세요: ");
      operand1 = scanner.nextInt();

      System.out.println("두 번째 숫자를 입력하세요: ");
      operand2 = scanner.nextInt();

      System.out.println("사칙연산 기호를 입력하세요: ");
      operator = scanner.next().charAt(0);

      if(operator=='+'){
        System.out.println("결과: "+ (operand1+operand2));
      }else if(operator=='-'){
        System.out.println("결과: "+ (operand1-operand2));
      }else if(operator=='*'){
        System.out.println("결과: "+ (operand1*operand2));
      }else if(operator=='/'){
        if(operand2==0){
          System.out.println("0으로는 나눌 수 없습니다");
        }else {
          System.out.println("결과: " + (operand1 / operand2));
        }
      }else{
        System.out.println("연산자로는 +, -, *, / 만 사용 가능합니다");
      }

      System.out.println("---\n더 계산하시겠습니까?");
      System.out.println("아무 문자를 입력하면 계속 계산합니다(단, exit를 입력하면 종료됩니다)\n---");
      command = scanner.next();

    }

  }
}
