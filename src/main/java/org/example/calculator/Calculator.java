package org.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Calculator {

  private final List<Integer> resultList = new ArrayList<>();

  public Optional<Integer> calculate(int a, int b, char operator) {
    // 오류 발생 없이 사칙연산이 가능한 경우를 나타내는 flag
    // isCorrect==true인 경우에만 result 값을 출력
    boolean isCorrect = true;
    Integer result = null;

      switch (operator) {
        case '+': {
          result = a + b;
          break;
        }
        case '-': {
          result = a - b;
          break;
        }
        case '*': {
          // overflow는?
          result = a * b;
          break;
        }
        case '/': {
          if (b == 0) {
            System.out.println("0으로는 나눌 수 없습니다");
            isCorrect = false;
          } else {
            result = a / b;
          }
          break;
        }
        default: {
          // 잘못된 연산자
          System.out.println("연산자로는 +, -, *, / 만 사용 가능합니다");
          isCorrect = false;
          break;
        }
      }

      // flag 안 걸린 경우에만 result 출력
      // 입력 오류 발생하지 않은 경우에만 출력
      if (isCorrect) {
        System.out.println("결과: " + result);
      }

    return Optional.ofNullable(result);
  }

  // getter
  public List<Integer> getResultList(){
    return resultList;
  }

  // setter
  public void addResultList(int element){
    resultList.add(element);
  }

  // delete
  public void removeResult(){
    if(!resultList.isEmpty())
      resultList.remove(0);
  }
}


