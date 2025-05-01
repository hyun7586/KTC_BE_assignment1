package org.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArithmeticCalculator {

  private final List<Integer> resultList = new ArrayList<>();

  public Optional<Integer> calculate(int a, int b, char operator) {
    OperatorType op = OperatorType.fromSymbol(operator);

    if(op==null)  return Optional.empty();

    return op.operate(a, b);
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


