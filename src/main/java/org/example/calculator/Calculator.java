package org.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Calculator {

  private final List<Integer> resultList = new ArrayList<>();

  public Optional<Integer> calculate(int a, int b, char operator) {
    if (operator == '+') {
      System.out.println("결과: "+(a+b));
      return Optional.of(a + b);
    }
    else if (operator == '-') {
      System.out.println("결과: "+(a-b));
      return Optional.of(a - b);
    }
    else if (operator == '*') {
      System.out.println("결과: "+(a*b));
      return Optional.of(a * b);
    }
    else if (operator == '/') {
      if (b == 0) {
        System.out.println("0으로는 나눌 수 없습니다");
        return null;
      }

      System.out.println("결과: "+(a/b));
      return Optional.of(a / b);
    }
    else {
      // 잘못된 연산자가 전달된 경우
      System.out.println("연산자로는 +, -, *, / 만 사용 가능합니다");
      return null;
    }
  }

  // getter
  public List<Integer> getResultList() {
    return resultList;
  }

  // setter
  public void addResultList(int element) {
    resultList.add(element);
  }

  // delete
  public void removeResult() {
    if (!resultList.isEmpty()) {
      resultList.remove(0);
    }
  }
}


