package org.example.calculator;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App {
  public static void main(String[] args){
    int operand1, operand2;
    char operator;
    Calculator calculator = new Calculator();

    // 오류 발생 없이 사칙연산이 가능한 경우를 나타내는 flag
    // isCorrect==true인 경우에만 result 값을 출력
    boolean isCorrect=true;
    String command="";

    Scanner scanner = new Scanner(System.in);

    while(!command.equals("exit")) {
      isCorrect=true;

      System.out.println("첫 번째 숫자를 입력하세요: ");
      operand1 = scanner.nextInt();

      System.out.println("두 번째 숫자를 입력하세요: ");
      operand2 = scanner.nextInt();

      System.out.println("사칙연산 기호를 입력하세요: ");
      operator = scanner.next().charAt(0);

      Optional<Integer> result = calculator.calculate(operand1, operand2, operator);

      if(result.isPresent())
        calculator.addResultList(result.get());


      System.out.println("더 계산하시겠습니까? (아무 문자나 입력해 주세요. 단, exit를 입력하면 종료됩니다)");
      command = scanner.next();

      if(command.equals("list")){
        List<Integer> list = calculator.getResultList();
        for(Integer each : list){
          System.out.print(each+" ");
        }
        System.out.println("\nlist 출력완료");
      }

      if(command.equals("remove")){
        calculator.removeResult();

        List<Integer> list = calculator.getResultList();
        for(Integer each : list){
          System.out.print(each+" ");
        }
        System.out.println("\nlist 출력완료");
      }
    }

    // removeResult main에 활용
  }
}
