package org.example.calculator.calculatorLV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Calculator {

  private List<Integer> resultList = new ArrayList<>();

  public Optional<Integer> calculate(int operand1, int operand2, char operator) {
    // 연산이 올바르게 수행될 수 있을 때에만 값이 들어감
    Optional<Integer> result=Optional.empty();

    if(operator=='+'){
      System.out.println("결과: "+ (operand1+operand2));
      result= Optional.of(operand1 + operand2);
    }else if(operator=='-'){
      System.out.println("결과: "+ (operand1-operand2));
      result= Optional.of(operand1 - operand2);
    }else if(operator=='*'){
      System.out.println("결과: "+ (operand1*operand2));
      result= Optional.of(operand1 * operand2);
    }else if(operator=='/'){
      if(operand2==0){
        System.out.println("0으로는 나눌 수 없습니다");
      }else {
        System.out.println("결과: " + (operand1 / operand2));
        result= Optional.of(operand1 / operand2);
      }
    }else{
      System.out.println("연산자로는 +, -, *, / 만 사용 가능합니다");
    }

    return result;
  }

  // getter
  public List<Integer> getResultList() {
    return resultList;
  }

  // setter
  public void setResultList(List<Integer> resultList) {
    this.resultList = resultList;
  }

  // delete
  public void removeResult() {
    if (!resultList.isEmpty()) {
      resultList.remove(0);
    }
  }
}


